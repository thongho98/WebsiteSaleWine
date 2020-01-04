package service.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.Cart;
import entity.Bill;
import entity.BillDetail;
import entity.BillStatus;
import entity.User;
import service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public boolean paying(HashMap<Integer, Cart> cartItem, User user, double total) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Bill bill = new Bill();
			BillDetail billDetail = new BillDetail();
			Date date = new Date(System.currentTimeMillis());
			
			String hql = "FROM BillStatus as bs WHERE bs.id = 2";
			Query query = session.createQuery(hql);
			BillStatus status = (BillStatus) query.uniqueResult();
			
			bill.setBillStatus(status);
			bill.setUser(user);
			bill.setCheckin(date);
			bill.setTotal(total);
			session.persist(bill);
			for (Entry<Integer, Cart> list : cartItem.entrySet()) {
				billDetail.setBill(bill);
				billDetail.setProducts(list.getValue().getProduct());
				billDetail.setQuantity(list.getValue().getQuantity());
				session.evict(billDetail);
				session.save(billDetail);
			}
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
			System.out.println("Loi" + e);
		} finally {
			session.close();
		}
		return false;
	}

}

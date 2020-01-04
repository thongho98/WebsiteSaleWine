package service.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Bill;
import entity.BillDetail;
import entity.BillStatus;
import service.BillService;

@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Bill> getAllBill(int start, int limit) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Bill b ORDER BY b.id DESC");
			query.setFirstResult(start);
			query.setMaxResults(limit);
			List<Bill> list = query.list();
			transaction.commit();
			return list;
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}
	
	@Override
	public List<BillStatus> getAllBillStatus() {
		Session session = factory.openSession();
		try {
			String hql = "FROM BillStatus";
			Query query = session.createQuery(hql);
			List<BillStatus> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@Override
	public long countTotalRecordsBill() {
		Session session = factory.openSession();
		String countQ = "Select count (b.id) from Bill b";
		Query countQuery = session.createQuery(countQ);
		return (Long) countQuery.uniqueResult();
	}
	
	@Override
	public boolean updateBillStatus(int id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Bill bill = (Bill) session.get(Bill.class, id);
			BillStatus status = new BillStatus();
			List<BillStatus> listStatus = getAllBillStatus();
			for (BillStatus billStatus : listStatus) {
				if(billStatus.getId() == 1) {
					status = billStatus;
				}
			}
			Date date = new Date(System.currentTimeMillis());
			bill.setCheckout(date);
			bill.setBillStatus(status);
			session.update(bill);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public boolean removeBill(int id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Bill bill = (Bill) session.get(Bill.class, id);
			BillStatus status = new BillStatus();
			List<BillStatus> listStatus = getAllBillStatus();
			for (BillStatus billStatus : listStatus) {
				if(billStatus.getId() == 3) {
					status = billStatus;
				}
			}
			Date date = new Date(System.currentTimeMillis());
			bill.setCheckout(date);
			bill.setBillStatus(status);
			session.update(bill);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public List<BillDetail> getBillDetail(int idBill) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM BillDetail bd WHERE bd.bill.id = :idBill");
			query.setParameter("idBill", idBill);
			List<BillDetail> list = query.list();
			transaction.commit();
			return list;
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}
	
	@Override
	public Bill getOneBill(int idBill) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Bill b WHERE b.id = :idBill");
			query.setParameter("idBill", idBill);
			Bill bill = (Bill) query.uniqueResult();
			transaction.commit();
			return bill;
		} catch (Exception ex) {
			if (transaction != null) {
				transaction.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		return null;
	}
}

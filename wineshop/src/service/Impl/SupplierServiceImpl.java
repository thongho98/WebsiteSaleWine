package service.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Supplier;
import service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService{
	
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Supplier> getAllSupplier() {
		Session session = factory.openSession();
		try {
			String hql = "FROM Supplier";
			Query query = session.createQuery(hql);
			List<Supplier> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}

package service.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
 
	@Autowired
	SessionFactory factory;
	
	@Override
	public User checkLoginAdmin(String username, String password) {
		Session session = factory.openSession();
		System.out.println(username);
		System.out.println(password);
		try {
			String hql = "FROM User as u where u.username= :username and u.password= :password and u.active=1 and u.role.id=2";
			Query query = session.createQuery(hql);
			query.setParameter("username", username);
			query.setParameter("password", password);
			User result = (User) query.uniqueResult();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}
}

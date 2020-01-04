package service.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.About;
import service.AboutService;

@Service
public class AboutServiceImpl implements AboutService{
	@Autowired
	SessionFactory factory;
	
	@Override
	public About showAbout(int id) {
		Session session = factory.getCurrentSession();
		try {
			String hql = "FROM About a WHERE a.id = :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			About result = (About) query.uniqueResult();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}
}

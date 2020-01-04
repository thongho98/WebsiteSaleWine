package service.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Category;
import service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Category> getAllCategory() {
		Session session = factory.openSession();
		try {
			String hql = "FROM Category";
			Query query = session.createQuery(hql);
			List<Category> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	@Override
	public boolean insertCategory(Category category) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(category);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public boolean updateCategory(Category category) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(category);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public boolean removeCategory(int id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Category category = (Category) session.get(Category.class, id);
			session.delete(category);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
}

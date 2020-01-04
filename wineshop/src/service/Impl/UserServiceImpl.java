package service.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Role;
import entity.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	SessionFactory factory;

	@Override
	public User checkLogin(String username, String password) {
		Session session = factory.getCurrentSession();
		System.out.println(username);
		System.out.println(password);
		try {
			String hql = "FROM User as u where u.username= :username and u.password= :password and u.active=1";
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

	@Override
	public boolean createUser(User user) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			String hql = "FROM Role as r WHERE r.id=1";
			Query query = session.createQuery(hql);
			Role role = (Role) query.uniqueResult();
			user.setRole(role);
			role.setUser(user);
			session.save(user);
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
	
	@Override
	public boolean changePassword(User user) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.saveOrUpdate(user);
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
	
	@Override
	public List<User> getAllUser(int start, int limit) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM User");
			query.setFirstResult(start);
			query.setMaxResults(limit);
			List<User> list = query.list();
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
	public Long countRecord() {
		Session session = factory.openSession();
		String countQ = "Select count (u.id) from User u";
		Query countQuery = session.createQuery(countQ);
		return (Long) countQuery.uniqueResult();
	}
	
	@Override
	public boolean insertUser(User user) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			String hql = "FROM Role as r WHERE r.id= :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", user.getRole().getId());
			Role role = (Role) query.uniqueResult();
			user.setRole(role);
			role.setUser(user);
			session.save(user);
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
	public boolean updateUser(User user) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			String hql = "FROM Role as r WHERE r.id= :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", user.getRole().getId());
			Role role = (Role) query.uniqueResult();
			user.setRole(role);
			role.setUser(user);
			session.flush();
			session.clear();
			session.saveOrUpdate(user);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
			System.out.println(e);
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public boolean deleteUser(Long id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			User user = (User) session.get(User.class, id);
			user.setActive(false);
			session.update(user);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public List<Role> getAllRole() {
		Session session = factory.openSession();
		try {
			String hql = "FROM Role r ORDER BY r.id DESC";
			Query query = session.createQuery(hql);
			query.setMaxResults(3);
			List<Role> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@Override
	public boolean isExitUsername(String username) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			String hql = "SELECT count(u.id) FROM User u WHERE u.username=:username";
			Query query = session.createQuery(hql);
			query.setParameter("username", username);
			Long result = (Long) query.uniqueResult();
			t.commit();
			if(result > 0) {
				return true;
			}
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
}

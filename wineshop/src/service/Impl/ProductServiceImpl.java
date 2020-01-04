package service.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import entity.ProductStatus;
import service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	SessionFactory factory;

	@Override
	public List<Product> getAllProduct(Integer offset, Integer maxResults) {
		Session session = factory.getCurrentSession();
		try {
			String hql = "FROM Product p WHERE p.productstatus.id = 1";
			Query query = session.createQuery(hql);
			query.setFirstResult((offset != null) ? offset : 0);
			query.setMaxResults((maxResults != null) ? maxResults : 6);
			List<Product> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}

	@Override
	public Product getProductById(int id) {
		Session session = factory.getCurrentSession();
		try {
			String hql = "FROM Product where id = :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			Product result = (Product) query.uniqueResult();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}

	@Override
	public List<Product> getNewProduct() {
		Session session = factory.getCurrentSession();
		try {
			String hql = "FROM Product r ORDER BY r.id DESC";
			Query query = session.createQuery(hql);
			query.setMaxResults(6);
			List<Product> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}

	@Override
	public List<Product> getProductByCategory(int id) {
		Session session = factory.getCurrentSession();
		try {
			String hql = "FROM Product r WHERE r.category.id = :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			List<Product> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}

	@Override
	public long countTotalRecords() {
		Session session = factory.openSession();
		String countQ = "Select count (p.id) from Product p";
		Query countQuery = session.createQuery(countQ);
		return (Long) countQuery.uniqueResult();
	}

	@Override
	public List<Product> getListNav(int start, int limit) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Product");
			query.setFirstResult(start);
			query.setMaxResults(limit);
			List<Product> list = query.list();
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
	public boolean insertProduct(Product product) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(product);
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
	public boolean updateProduct(Product product) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(product);
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
	public boolean deleteProduct(int id) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Product product = (Product) session.get(Product.class, id);
			ProductStatus status = new ProductStatus();
			List<ProductStatus> listStatus = getAllProductStatus();
			for (ProductStatus productStatus : listStatus) {
				if (productStatus.getId() == 3) {
					status = productStatus;
				}
			}
			product.setProductstatus(status);
			session.update(product);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}

	@Override
	public List<ProductStatus> getAllProductStatus() {
		Session session = factory.openSession();
		try {
			String hql = "FROM ProductStatus";
			Query query = session.createQuery(hql);
			List<ProductStatus> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Product> findProduct(String keyword) {
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("FROM Product p WHERE p.name like ?");
			query.setString(0, "%"+keyword+"%");
			query.setMaxResults(6);
			List<Product> list = query.list();
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
}

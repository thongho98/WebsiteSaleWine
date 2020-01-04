package service;

import java.util.List;

import entity.Product;
import entity.ProductStatus;

public interface ProductService {
	
	public List<Product> getAllProduct(Integer offset, Integer maxResults);
	public Product getProductById(int id);
	public List<Product> getNewProduct();
	public List<Product> getProductByCategory(int id);
	public long countTotalRecords();
	public List<Product> getListNav(int start, int limit);
	
	public List<ProductStatus> getAllProductStatus();
	public boolean insertProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int id);
	
	public List<Product> findProduct(String keyword);
}

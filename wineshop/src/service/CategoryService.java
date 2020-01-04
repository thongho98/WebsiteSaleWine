package service;

import java.util.List;

import entity.Category;

public interface CategoryService {

	List<Category> getAllCategory();
	boolean insertCategory(Category category);
	boolean updateCategory(Category category);
	boolean removeCategory(int id);
}

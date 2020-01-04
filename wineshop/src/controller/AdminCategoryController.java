package controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Category;
import service.CategoryService;

@Controller
@RequestMapping("/admin/")
@Transactional
public class AdminCategoryController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	SessionFactory factory;

	@Autowired
	HttpSession session;

	@RequestMapping("category")
	public String category(ModelMap model) {
		if (session.getAttribute("adminsession") != null) {
			List<Category> listCategory = categoryService.getAllCategory();
			model.addAttribute("listCategory", listCategory);
			return "admin/category_list";
		}
		return "404";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String category_form(ModelMap model) {
		model.addAttribute("category", new Category());
		return "admin/category_form";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String category_form(ModelMap model, @ModelAttribute("category") Category category) {
		boolean check = categoryService.insertCategory(category);
		if (check) {
			model.addAttribute("message", "Thêm mới thành công!");
		} else {
			model.addAttribute("message", "Thêm mới thất bại!");
		}
		return "admin/category_form";
	}

	@RequestMapping(value = "category/update/{id}", method = RequestMethod.GET)
	public String edit(ModelMap model, @PathVariable("id") int id) {
		Session session = factory.getCurrentSession();
		Category category = (Category) session.get(Category.class, id);
		model.addAttribute("category", category);
		return "admin/category_update";
	}

	@RequestMapping(value = "category/update/{id}", method = RequestMethod.POST)
	public String edit(ModelMap model, @ModelAttribute("category") Category category) {
		boolean check = categoryService.updateCategory(category);
		if (check) {
			model.addAttribute("message", "Cập nhật thành công!");
		} else {
			model.addAttribute("message", "Cập nhật thất bại!");
		}
		return "admin/category_update";
	}

	@RequestMapping("category/remove/{id}")
	public String delete(ModelMap model, @PathVariable("id") int id) {
		boolean check = categoryService.removeCategory(id);
		if (check) {
			model.addAttribute("message", "Xóa thành công!");
		} else {
			model.addAttribute("message", "Xóa thất bại!");
		}
		return "redirect:/admin/category.html";
	}
}

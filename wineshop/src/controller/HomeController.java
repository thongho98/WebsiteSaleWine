package controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Category;
import entity.Product;
import service.CategoryService;
import service.ProductService;

@Controller
@Transactional
@RequestMapping("/")
public class HomeController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@RequestMapping("index")
	public String index(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);

		List<Product> listNewProduct = productService.getNewProduct();
		model.addAttribute("listNewProduct", listNewProduct);

		List<Product> listProductItalia = productService.getProductByCategory(1);
		model.addAttribute("listProductItalia", listProductItalia);

		List<Product> listProductFrance = productService.getProductByCategory(2);
		model.addAttribute("listProductFrance", listProductFrance);
		return "index";
	}

	@RequestMapping("error")
	public String error404(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "404";
	}

	@RequestMapping("thank-you")
	public String thank(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "thank-you";
	}

	@RequestMapping("success")
	public String success(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "success";
	}
}

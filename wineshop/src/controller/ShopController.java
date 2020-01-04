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
public class ShopController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("shop")
	public String shop(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		
		List<Product> listProductItalia = productService.getProductByCategory(1);
		model.addAttribute("listProductItalia", listProductItalia);
		
		List<Product> listProductFrance = productService.getProductByCategory(2);
		model.addAttribute("listProductFrance", listProductFrance);
		
		List<Product> listProductChile = productService.getProductByCategory(3);
		model.addAttribute("listProductChile", listProductChile);
		return "shop";
	}
}

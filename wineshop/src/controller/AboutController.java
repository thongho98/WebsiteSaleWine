package controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.About;
import entity.Category;
import service.AboutService;
import service.CategoryService;

@Controller
@Transactional
@RequestMapping("/")
public class AboutController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	AboutService aboutService;
	
	@RequestMapping("about")
	public String about(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		
		About about = aboutService.showAbout(3);
		model.addAttribute("about", about);
		return "about";
	}
	
}

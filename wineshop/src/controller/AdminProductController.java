package controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import entity.Product;
import service.CategoryService;
import service.ProductService;
import service.SupplierService;

@Controller
@RequestMapping("/admin/")
public class AdminProductController {

	@Autowired
	HttpSession session;

	@Autowired
	SessionFactory factory;

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	SupplierService supplierService;

	@Autowired
	ServletContext context;

	@RequestMapping(value = "product", method = RequestMethod.GET)
	public String viewProductList(ModelMap model) {
		if (session.getAttribute("adminsession") != null) {
			model.addAttribute("listProduct", productService.getListNav(0, 10));
			model.addAttribute("page", productService.countTotalRecords() / 10);
			model.addAttribute("totalItem", productService.countTotalRecords());
			model.addAttribute("countItem", 10);
			return "admin/product_list";
		}
		return "404";
	}

	@RequestMapping(value = "product/{page}", method = RequestMethod.GET)
	public String viewProductListByPage(ModelMap model, @PathVariable("page") int page) {
		model.addAttribute("listProduct", productService.getListNav((page - 1) * 10, 10));
		model.addAttribute("page", productService.countTotalRecords() / 10);
		model.addAttribute("totalItem", productService.countTotalRecords());
		if ((page * 10) > productService.countTotalRecords()) {
			model.addAttribute("countItem", productService.countTotalRecords() - (page - 1) * 10);
		} else {
			model.addAttribute("countItem", 10);
		}
		return "admin/product_list";
	}

	@RequestMapping(value = "product/insert", method = RequestMethod.GET)
	public String product_form(ModelMap model) {
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("showroom", supplierService.getAllSupplier());
		model.addAttribute("productStatus", productService.getAllProductStatus());
		return "admin/product_form";
	}

	@RequestMapping(value = "product/insert", method = RequestMethod.POST)
	public String product_form(ModelMap model, @ModelAttribute("product") Product product,
			@RequestParam("photo") MultipartFile photo, HttpServletRequest request) {
		context = request.getSession().getServletContext();
		if (photo.isEmpty()) {
			model.addAttribute("message", "Vui lòng cho hình ảnh vào!");
		} else {
			try {
				// String photoPath = context.getRealPath("/images/" +
				// photo.getOriginalFilename());
				photo.transferTo(
						new File("D:\\ProjectWeb\\wineshop\\WebContent\\images\\" + photo.getOriginalFilename()));
				product.setUrl("images/" + photo.getOriginalFilename());
				boolean check = productService.insertProduct(product);
				if (check) {
					model.addAttribute("message", "Thêm sản phẩm mới thành công!");
				} else {
					model.addAttribute("message", "Thêm sản phẩm mới thất bại!");
				}
				return "admin/product_form";
			} catch (Exception e) {
				System.out.println(e);
				model.addAttribute("message", "Lưu hình ảnh thất bại!");
			}
		}
		return "404";
	}

	@RequestMapping(value = "product/update/{id}", method = RequestMethod.GET)
	public String editProduct(ModelMap model, @PathVariable("id") int id) {
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, id);
		model.addAttribute("product", product);
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("showroom", supplierService.getAllSupplier());
		model.addAttribute("productStatus", productService.getAllProductStatus());
		return "admin/product_update";
	}

	@RequestMapping(value = "product/update/{id}", method = RequestMethod.POST)
	public String editProduct(ModelMap model, @ModelAttribute("product") Product product,
			@RequestParam("photo") MultipartFile photo, HttpServletRequest request) {
		context = request.getSession().getServletContext();
		if (!photo.isEmpty()) {
			try {
				photo.transferTo(new File("D:\\ProjectWeb\\wineshop\\WebContent\\images\\" + photo.getOriginalFilename()));
				product.setUrl("images/" + photo.getOriginalFilename());
				boolean check = productService.updateProduct(product);
				if (check) {
					model.addAttribute("message", "Cập nhật thành công!");
				} else {
					model.addAttribute("message", "Cập nhật thất bại!");
				}
				return "admin/product_update";
			}catch (Exception e) {
				
			}
		}
		boolean check = productService.updateProduct(product);
		if (check) {
			model.addAttribute("message", "Cập nhật thành công!");
		} else {
			model.addAttribute("message", "Cập nhật thất bại!");
		}
		return "admin/product_update";
	}

	@RequestMapping("product/remove/{id}")
	public String deleteProduct(ModelMap model, @PathVariable("id") int id) {
		boolean check = productService.deleteProduct(id);
		if (check) {
			model.addAttribute("message", "Xóa thành công!");
		} else {
			model.addAttribute("message", "Xóa thất bại!");
		}
		return "redirect:/admin/product.html";
	}
}

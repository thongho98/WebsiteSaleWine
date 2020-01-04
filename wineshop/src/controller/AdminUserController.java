package controller;

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

import entity.User;
import service.UserService;

@Controller
@RequestMapping("/admin/")
public class AdminUserController {
	@Autowired
	public UserService userService;

	@Autowired
	SessionFactory factory;

	@Autowired
	HttpSession session;
	
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String viewUserList(ModelMap model) {
		if (session.getAttribute("adminsession") != null) {
			model.addAttribute("listUser", userService.getAllUser(0, 10));
			model.addAttribute("page", userService.countRecord() / 10);
			model.addAttribute("totalItem", userService.countRecord());
			model.addAttribute("countItem", 10);
			return "admin/user_list";
		}
		return "404";
	}

	@RequestMapping(value = "user/{page}", method = RequestMethod.GET)
	public String viewUserListByPage(ModelMap model, @PathVariable("page") int page) {
		model.addAttribute("listUser", userService.getAllUser((page - 1) * 10, 10));
		model.addAttribute("page", userService.countRecord() / 10);
		model.addAttribute("totalItem", userService.countRecord());
		if ((page * 10) > userService.countRecord()) {
			model.addAttribute("countItem", userService.countRecord() - (page - 1) * 10);
		} else {
			model.addAttribute("countItem", 10);
		}
		return "admin/user_list";
	}

	@RequestMapping(value = "user/insert", method = RequestMethod.GET)
	public String insertUser(ModelMap model) {
		model.addAttribute("user", new User());
		model.addAttribute("role", userService.getAllRole());
		return "admin/user_form";
	}

	@RequestMapping(value = "user/insert", method = RequestMethod.POST)
	public String insertUser(ModelMap model, @ModelAttribute("user") User user) {
		boolean check = userService.insertUser(user);
		if (check) {
			model.addAttribute("message", "Thêm mới thành công!");
		} else {
			model.addAttribute("message", "Thêm mới thất bại!");
		}
		model.addAttribute("role", userService.getAllRole());
		return "admin/user_form";
	}

	@RequestMapping(value = "user/update/{id}", method = RequestMethod.GET)
	public String editUser(ModelMap model, @PathVariable("id") Long id) {
		Session session = factory.openSession();
		User user = (User) session.get(User.class, id);
		model.addAttribute("user", user);
		model.addAttribute("role", userService.getAllRole());
		return "admin/user_update";
	}

	@RequestMapping(value = "user/update/{id}", method = RequestMethod.POST)
	public String editUser(ModelMap model, @ModelAttribute("user") User user) {
		boolean check = userService.updateUser(user);
		if (check) {
			model.addAttribute("message", "Cập nhật thành công!");
		} else {
			model.addAttribute("message", "Cập nhật thất bại!");
		}
		model.addAttribute("role", userService.getAllRole());
		return "admin/user_update";
	}

	@RequestMapping("user/remove/{id}")
	public String deleteUser(ModelMap model, @PathVariable("id") Long id) {
		boolean check = userService.deleteUser(id);
		if (check) {
			model.addAttribute("message", "Xóa thành công!");
		} else {
			model.addAttribute("message", "Xóa thất bại!");
		}
		return "redirect:/admin/user.html";
	}
}

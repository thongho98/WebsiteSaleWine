package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.LoginRequest;
import entity.User;
import service.AdminService;

@Controller
@RequestMapping("/admin/")
public class AdminAccessController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String signInAdmin(ModelMap model) {
		model.addAttribute("loginRequest", new LoginRequest());
		return "admin/login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String signInAdmin(ModelMap model, @ModelAttribute("loginRequest") LoginRequest loginRequest) {
		User user = adminService.checkLoginAdmin(loginRequest.getUsername(), loginRequest.getPassword());
		if (user == null) {
			model.addAttribute("message", "Vui lòng kiểm tra lại tài khoản và mật khẩu!");
			return "admin/login";
		}
		session.setAttribute("adminsession", user);
		return "admin/index";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logoutAdmin(ModelMap model) {
		session.invalidate();
		return "redirect:/admin/login.html";
	}
}

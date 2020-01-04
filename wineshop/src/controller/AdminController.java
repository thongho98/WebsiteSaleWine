package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.AdminService;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	HttpSession session;

	@RequestMapping("index")
	public String index() {
		if(session.getAttribute("adminsession") != null) {
			return "admin/index";
		}
		return "404";
	}
}

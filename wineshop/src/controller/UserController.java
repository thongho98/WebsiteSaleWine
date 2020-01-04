package controller;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.ChangePasswordRequest;
import dto.LoginRequest;
import dto.RegisterRequest;
import entity.User;
import service.UserService;

@Controller
@Transactional
public class UserController {

	@Autowired
	public UserService userService;

	@Autowired
	public HttpSession session;

	@RequestMapping(value = "sign-in", method = RequestMethod.GET)
	public String signIn(ModelMap model) {
		model.addAttribute("loginRequest", new LoginRequest());
		return "sign-in";
	}

	@RequestMapping(value = "sign-in", method = RequestMethod.POST)
	public String signIn(ModelMap model, @ModelAttribute("loginRequest") @Valid LoginRequest loginRequest) {
		User user = userService.checkLogin(loginRequest.getUsername(), loginRequest.getPassword());
		if (user == null) {
			model.addAttribute("message", "Vui lòng kiểm tra lại tài khoản và mật khẩu!");
			return "sign-in";
		}
		session.setAttribute("usersession", user);
		return "index";
	}

	@RequestMapping("sign-up")
	public String signUp(ModelMap model) {
		model.addAttribute("registerRequest", new RegisterRequest());
		return "sign-up";
	}

	@RequestMapping(value = "sign-up", method = RequestMethod.POST)
	public String signUp(@ModelAttribute("registerRequest") @Valid RegisterRequest registerRequest,
			BindingResult errors) {
		if (userService.isExitUsername(registerRequest.getUsername())) {
			errors.rejectValue("username", "registerRequest", "Tên tài khoản tồn tại");
		}
		if (errors.hasErrors()) {
			return "sign-up";
		} else {
			User user = new User();
			if (registerRequest.getPassword().equals(registerRequest.getConfirmPassword())) {
				BeanUtils.copyProperties(registerRequest, user);
				userService.createUser(user);
				return "redirect:success.html";
			}
			return "sign-up";
		}

	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		session.invalidate();
		return "index";
	}

	@RequestMapping("account-info")
	public String acountInfo(ModelMap model) {
		model.addAttribute("changePassword", new ChangePasswordRequest());
		return "account-info";
	}

	@RequestMapping(value = "account-info", method = RequestMethod.POST)
	public String acountInfo(ModelMap model,
			@ModelAttribute("changePassword") @Valid ChangePasswordRequest changePasswordRequest,
			BindingResult errors) {
		if (errors.hasErrors()) {
			return "account-info";
		} else {
			User user = (User) session.getAttribute("usersession");
			if (!changePasswordRequest.getPassword().equals(user.getPassword())) {
				model.addAttribute("message", "Vui lòng kiểm tra lại password!");
			}
			if (!changePasswordRequest.getNewPassword().equals(changePasswordRequest.getConfirmNewPassword())) {
				model.addAttribute("message", "Mật khẩu mới không trùng khớp!");
			}
			model.addAttribute("message", "Thay đổi password thành công!");
			user.setPassword(changePasswordRequest.getNewPassword());
			userService.changePassword(user);
			return "account-info";
		}
	}
}

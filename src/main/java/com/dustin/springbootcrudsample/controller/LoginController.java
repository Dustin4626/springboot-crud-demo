package com.dustin.springbootcrudsample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("/user/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model,
			HttpSession session) {
		if (!StringUtils.isEmpty(username) && password.equals("1234")) {
			session.setAttribute("loginUser", username);
			return "redirect:/dashboard.html";
		} else {
			model.addAttribute("msg", "請輸入正確的帳號密碼");
			return "index";
		}
	}

//	@RequestMapping("/user/login")
//	@ResponseBody
//	public String login() {
//		return "ok";
//	}

}

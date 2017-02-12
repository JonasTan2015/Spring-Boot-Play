package com.bookstore.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookstore.domain.User;
import com.bookstore.domain.UserDAO;
import com.bookstore.domain.security.PasswordResetToken;
import com.bookstore.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	


	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("classActiveLogin", true);
		return "myAccount";
		
	}
	
	@RequestMapping("/forgetPassword")
	public String forgetPassword(Model model){
		
		PasswordResetToken passToken=UserService.getPasswordResetToken(token);
		model.addAttribute("classActiveForgetPassword", true);
		return "myAccount";
		
	}
	
	@RequestMapping("/newUser")
	public String newUser(
			Locale locale,
			@RequestParam("token") String token,
			Model model){
		model.addAttribute("classActiveNewUser", true);
		return "myAccount";
		
	}
}

package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.domain.User;
import com.bookstore.domain.UserDAO;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/myAccount")
	public String myAccount(){
		return "myAccount";
	}

}

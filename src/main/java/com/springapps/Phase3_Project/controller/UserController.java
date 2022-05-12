package com.springapps.Phase3_Project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.Phase3_Project.entity.User;
import com.springapps.Phase3_Project.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/register1")
	public String showRegistrationPage() {
		return "userreg1";
	}
	@RequestMapping(value="/registeruser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,ModelMap model) {
		int result=userService.save(user);
		String message="User created with id "+result;
		model.addAttribute("result",message);
		
		
		return "userreg1";
	}
	
	@RequestMapping(value="/displayuser",method=RequestMethod.GET)
	public String displayUser(@ModelAttribute("user") User user,ModelMap model) {
		
		List<User> users=userService.getUsers();
		model.addAttribute("users",users);
		
		return "display";
	}

	
}

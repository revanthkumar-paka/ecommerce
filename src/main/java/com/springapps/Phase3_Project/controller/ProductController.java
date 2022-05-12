package com.springapps.Phase3_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springapps.Phase3_Project.entity.Product;
import com.springapps.Phase3_Project.entity.User;
import com.springapps.Phase3_Project.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}
	@RequestMapping(value="/registerproduct",method=RequestMethod.POST)
	public String registerProduct(@ModelAttribute("product") Product product,ModelMap model) {
		int result=productService.save(product);
		String message="User created with id "+result;
		model.addAttribute("result",message);
		
		
		return "userreg";
	}
	@RequestMapping(value="/displayproduct",method=RequestMethod.GET)
	public String displayUser(@ModelAttribute("product") User user,ModelMap model) {
		
		List<Product> products=productService.getproducts();
		model.addAttribute("products",products);
		
		return "display1";
	}
}

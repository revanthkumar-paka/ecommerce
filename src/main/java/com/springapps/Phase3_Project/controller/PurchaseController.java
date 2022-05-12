package com.springapps.Phase3_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.springapps.Phase3_Project.entity.Purchase;
import com.springapps.Phase3_Project.service.PurchaseService;


@Controller
public class PurchaseController {
	@Autowired
	PurchaseService purchaseService;
	
	@RequestMapping("/register2")
	public String showRegistrationPage() {
		return "userreg2";
	}
	@RequestMapping(value="/registerpurchase",method=RequestMethod.POST)
	public String registerPurchase(@ModelAttribute("purchase") Purchase purchase,ModelMap model) {
		int result=purchaseService.save(purchase);
		String message="User created with id "+result;
		model.addAttribute("result",message);
		
		
		return "userreg2";
	}
}

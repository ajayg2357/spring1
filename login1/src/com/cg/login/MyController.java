package com.cg.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@Autowired
	Login login;
	
	
	@RequestMapping(value="/showForm", method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("login",login);
		return "login";
		
	}
	
	@RequestMapping(value="/checkLogin", method=RequestMethod.POST)
	public String CheckLoginPage(Login login, Model model){
		model.addAttribute("register",new Register());
		
		return "register";
		}

		@RequestMapping(value="/register", method=RequestMethod.POST)
		public String registerPage(Register register, Model model){
			
			model.addAttribute("register",register);
			return "success";
			
			
			
	
		
	}

}

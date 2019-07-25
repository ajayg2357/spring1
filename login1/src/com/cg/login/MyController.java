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
	public String CheckLogin(Login login){
		
		if(login.getUserName().equals("admin"))
		{
			return "success";
		}
		else{
			return "login";
			
		}
	
		
	}

}

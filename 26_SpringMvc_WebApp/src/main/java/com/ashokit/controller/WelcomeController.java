package com.ashokit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "wishMessage")
	public ModelAndView getWelcomeMessage() {
		
		//"welcome" -> viewpage
		ModelAndView mav = new ModelAndView("welcome"); 
		mav.addObject("wishMessage", "Welcome To AshokIT For Spring MVC WebAplication Development");
		
		return mav;		
	}
	
	@RequestMapping(value = "generateWishes")
	public ModelAndView generateWishes(@RequestParam Map<String,String> queryParamData) {
		
		String username = queryParamData.get("username");
		String password = queryParamData.get("password");
		
		String loginStatus = "Failure";
		if("mahesh".equalsIgnoreCase(username) && "mahesh".equalsIgnoreCase(password)) {
			loginStatus = "Success";
		}
		
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("wishMessage","Welcome To AshokIT For Spring MVC WebApplication Development...");
		mav.addObject("loginStatus",loginStatus);
		
		return mav;			
	}
	
	@RequestMapping(value = "loginStatus")
	public ModelAndView getLoginStatus(@RequestParam("username") String username,
			                           @RequestParam("password") String password) {
		
		String loginStatus = "Failure";
		if("mahesh".equalsIgnoreCase(username) && "mahesh".equalsIgnoreCase(password)) {
			loginStatus = "Success";
		}
		
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("wishMessage","Welcome To AshokIT For Spring MVC WebApplication Development...");
		mav.addObject("loginStatus",loginStatus);
		
		return mav;		
		
	}

}

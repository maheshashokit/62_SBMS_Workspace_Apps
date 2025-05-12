package com.ashokit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	
	@RequestMapping("/")
	public ModelAndView getEnquiryPage() {
		return new ModelAndView("enquiry");
	}
	
	@RequestMapping(value="sendEnquiry",method = RequestMethod.POST)
	public ModelAndView processEnquiryDetails(@RequestParam Map<String,String> formData) {
		ModelAndView mav = new ModelAndView("confirmation");
		mav.addObject("enquiryInfo", formData);
		return mav;
	}

}

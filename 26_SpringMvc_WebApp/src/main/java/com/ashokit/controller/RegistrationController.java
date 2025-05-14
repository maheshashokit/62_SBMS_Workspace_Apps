package com.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.beans.Enquiry;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("/")
	public ModelAndView getEnquiryPage(ModelMap modelMap) {
		//return new ModelAndView("enquiry");
		modelMap.addAttribute("enquiryForm", new Enquiry());
		return new ModelAndView("courseEnquiry");
	}
	
	@RequestMapping(value="sendEnquiry",method = RequestMethod.POST)
	public ModelAndView processEnquiryDetails(@RequestParam Map<String,String> formData) {
		ModelAndView mav = new ModelAndView("confirmation");
		mav.addObject("enquiryInfo", formData);
		return mav;
	}
	
	@RequestMapping(value="enquiryDetails",method = RequestMethod.POST)
	public ModelAndView processingEnquiryDetails(@RequestParam Map<String,String> formData) {
		//setting the form data into Java Object
		Enquiry enq = new Enquiry();
		enq.setFirstName(formData.get("firstName"));
		enq.setEmailId(formData.get("emailId"));
		enq.setContactNo(formData.get("contactNo"));
		enq.setCourses(formData.get("courses"));
		
		ModelAndView mav = new ModelAndView("confirmation");
		mav.addObject("enquiryInfo", enq);
		return mav;
	}
	
	
	@RequestMapping(value="processEnquiry", method=RequestMethod.POST)
	public ModelAndView processEnquiry(@ModelAttribute("enquiryForm") Enquiry enquiry) {
		ModelAndView mav = new ModelAndView("confirmation");
		
		//sharing the data to view page
		mav.addObject("enquiryInfo", enquiry);
		
		return mav;
	}

}

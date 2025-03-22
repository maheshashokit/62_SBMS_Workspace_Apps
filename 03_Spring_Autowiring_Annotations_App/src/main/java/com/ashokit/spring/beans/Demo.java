package com.ashokit.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Demo {
	
	@Autowired
	@Qualifier(value = "currentUser1")  // Qualifying the particular bean definition out of multiple bean definitions
	private User user;
	
	public void displayData() {
		String userDetails = user.getUserDetails();
		System.out.println(userDetails);
	}

}

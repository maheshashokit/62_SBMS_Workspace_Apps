package com.ashokit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.controller.UserController;
import com.ashokit.helpers.EmployeeHelper;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Requesting the spring beans
		UserController userController = context.getBean(UserController.class);
		System.out.println(userController);;
		EmployeeHelper empHelper = context.getBean(EmployeeHelper.class);
		System.out.println(empHelper);
		
	}

}

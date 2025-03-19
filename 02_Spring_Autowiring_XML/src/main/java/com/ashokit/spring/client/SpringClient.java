package com.ashokit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashokit.spring.beans.Student;

public class SpringClient {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = (Student)context.getBean("stu");
		System.out.println(student);
		
	}

}

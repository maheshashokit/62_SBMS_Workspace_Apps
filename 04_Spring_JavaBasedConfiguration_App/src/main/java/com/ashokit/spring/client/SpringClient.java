package com.ashokit.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashokit.spring.beans.Address;
import com.ashokit.spring.beans.Course;
import com.ashokit.spring.beans.Demo;
import com.ashokit.spring.beans.Student;
import com.ashokit.spring.beans.User;
import com.ashokit.spring.config.DatabaseConfig;
import com.ashokit.spring.config.EmailConfig;
import com.ashokit.spring.config.SpringConfig;

public class SpringClient {

	public static void main(String[] args) {
		
		//Creating container object and passing java based configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//Request spring bean object based on object type
		User user = context.getBean(User.class);
		System.out.println(user);
		System.out.println(user.hashCode());
		User user1 = context.getBean(User.class);
		System.out.println(user1.hashCode());
		User user2 = context.getBean(User.class);
		System.out.println(user2.hashCode());
		
		Demo demo = context.getBean(Demo.class);
		System.out.println(demo);
		
		Student st = context.getBean(Student.class);
		System.out.println(st);
		
		Course ct = context.getBean(Course.class);
		System.out.println(ct);
		
		Address address = context.getBean(Address.class);
		System.out.println(address);
		
	}
}

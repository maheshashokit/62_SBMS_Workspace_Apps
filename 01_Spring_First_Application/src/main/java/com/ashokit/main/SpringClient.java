package com.ashokit.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ashokit.spring.beans.Demo;
import com.ashokit.spring.beans.Employee;
import com.ashokit.spring.beans.Test;

public class SpringClient {

	public static void main(String[] args) {
		
		//Activating the spring container
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Activating the BeanFactory Container
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		
		//Reading the Spring Configuration file
		XmlBeanDefinitionReader xbfr = new XmlBeanDefinitionReader(context);
		xbfr.loadBeanDefinitions("spring.xml");		
		
		//Requesting object to spring container
		Demo demoObj = (Demo)context.getBean("demoBean");
	    Test testObj = (Test)context.getBean("testBean");
	    Employee empObj = (Employee)context.getBean("empBean");
		
		//calling the service method to display value for message property
		demoObj.displayMessage();
		testObj.displayData();
		//calling service method from employee springbean
		empObj.displayEmployeeDetails();
		
	}
}

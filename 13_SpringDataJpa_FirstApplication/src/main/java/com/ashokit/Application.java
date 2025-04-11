package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.controller.CustomerController;
import com.ashokit.entity.Customer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Entity class object data
		Customer customer = new Customer();
		customer.setCustomerId(123);
		customer.setName("Mahesh");
		customer.setEmailId("mahesh.ashokit@gmail.com");
		customer.setContactNo("1234556");
		
		//New Customer Information
		Customer customer1 = new Customer(1526,"Mahesh","Hyderabad","mahesh111.ashokit@gmail.com","123456788");
		Customer customer2 = new Customer(1516,"Suresh","Pune","suresh11.ashokit@gmail.com","54545444");
		Customer customer3 = new Customer(1528,"Rajesh","Chennai","rajesh22.ashokit@gmail.com","23323233");
		Customer customer4 = new Customer(1529,"Ramesh","Hyderabad","ramesh33.ashokit@gmail.com","121212221");

		//controller object
		CustomerController customerController = context.getBean(CustomerController.class);
		
		//calling the controller method
		//customerController.createNewCustomer(customer);
		
		customerController.createBulkNewCustomers(List.of(customer1,customer2,customer3,customer4));
		
	}

}

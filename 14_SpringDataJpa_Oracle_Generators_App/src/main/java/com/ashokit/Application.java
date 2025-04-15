package com.ashokit;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.dao.CustomerDao;
import com.ashokit.dao.ProductDao;
import com.ashokit.entities.Customer;
import com.ashokit.entities.Product;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ProductDao productDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p = new Product();
		p.setProductName("Laptop");
		p.setProductPrice(50000.00f);
		
		Product p1 =new Product();
		p1.setProductName("Mobilephone");
		p1.setProductPrice(10000.00f);
		
		Iterable<Product> savedProducts = productDao.saveAll(Arrays.asList(p,p1));
		savedProducts.forEach(prod -> System.out.println(prod));   
		
		System.out.println("*****************************************************************");
		
		//inserting the record for an customer
		Customer c = new Customer();
		c.setCustomerName("Suresh");
		c.setCustomerLocation("Hyderabad");
		
		Customer savedCustomer = customerDao.save(c);
		System.out.println(savedCustomer);
	}
}
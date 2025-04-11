package com.ashokit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//Autowiring the DAO object
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer creatingNewBrandCustomer(Customer customer) {
		
		 //save method internally inserts the data into table		
		 Customer savedCustomerInfo = customerDao.save(customer);
		
		 return savedCustomerInfo;
	}
	
	@Override
	public Iterable<Customer> createBulkNewBrandCustomers(List<Customer> customers) {
		
		Iterable<Customer> savedCustomers = customerDao.saveAll(customers);
		
		return savedCustomers;
	}

	@Override
	public Customer findCustomerById(Integer customerId) {
		
		//Getting the CustomeDetails based On CustomerId
		Optional<Customer> customerDetails = customerDao.findById(customerId);
		
		//checking the customerDetails optional object
		if(customerDetails.isPresent()) {
			Customer shoppingCustomer = customerDetails.get();
			return shoppingCustomer;
		}else {
			//Throw the Exception 
			return null;
		}
	}

	@Override
	public Iterable<Customer> fetchAllCustomers() {
		
		Iterable<Customer> allCustomers = customerDao.findAll();
		
		return allCustomers;
	}


}

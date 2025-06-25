package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.request.CustomerRequest;
import com.ashokit.response.ApiResponse;
import com.ashokit.response.CustomerResponse;
import com.ashokit.services.CustomerService;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;	
	
	@GetMapping(value = "/")
	public ResponseEntity<?> fetchAllCustomers(){
		List<CustomerResponse> allCustomers = customerService.getAllCustomers();
		return ResponseEntity.ok(allCustomers);
	}
	
	@GetMapping(value = "/{customerId}")
	public ResponseEntity<?> fetchCustomerDetailsById(@PathVariable("customerId") Integer customerId){
		//FirstTechnique -> Not Readable
		//CustomerResponse customerDetails = customerService.getCustomerById(customerId);
		
		//SecondTechnique -> Readability
		ApiResponse customerDetails = customerService.getCustomerById(customerId);
		
		return ResponseEntity.ok(customerDetails);
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> createNewCustomer(@RequestBody CustomerRequest customerRequest){
		CustomerResponse newCustomerDetails = customerService.createCustomer(customerRequest);
		return new ResponseEntity<>(newCustomerDetails, HttpStatus.CREATED);
	}	
}
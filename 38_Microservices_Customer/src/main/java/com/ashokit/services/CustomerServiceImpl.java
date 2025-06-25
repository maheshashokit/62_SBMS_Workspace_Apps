package com.ashokit.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;
import com.ashokit.request.CustomerRequest;
import com.ashokit.response.AddressResponse;
import com.ashokit.response.ApiResponse;
import com.ashokit.response.CustomerResponse;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${address.service.name.url}")
	private String addressServiceUrl;
		
	@Override
	public CustomerResponse createCustomer(CustomerRequest customerRequest) {
		//converting from CustomerRequest To Entity Class Object
		Customer customer = convertingFromRequestToEntity(customerRequest);
		//Saving Customer Information
		Customer savedCustomer = this.customerDao.save(customer);
		//Converting From Customer Entity to CustomerResponse Object
		return this.convertingEntityToResponse(savedCustomer);
	}

	@Override
	public ApiResponse getCustomerById(Integer customerId) {
		Optional<Customer> customerDetails = this.customerDao.findById(customerId);
		if (customerDetails.isPresent()) {
			Customer custDetails = customerDetails.get();
			
			CustomerResponse customerResponse = this.convertingEntityToResponse(custDetails);
			
			//Address Microservice interaction
			AddressResponse addressResponse = callingAddressServiceWithRestTemplate(customerId);
			
			//setting addressResponse into customerResponse
			//customerResponse.setAddressResponse(addressResponse);
			
			ApiResponse apiResponse = new ApiResponse();
			apiResponse.setCustomerDetails(customerResponse);
			apiResponse.setAddressDetails(addressResponse);
					
			return apiResponse;
		}else {
			//throw the exception
			return null;
		}
	}
	
	
	
	@Override
	public List<CustomerResponse> getAllCustomers() {
	
		//Getting All Customers Details
		List<Customer> allCustomers = this.customerDao.findAll();
		
		//converting from List<Customer> into List<CustomerResponse> Using Java8 streams
		List<CustomerResponse> allCustomerResponse = 
				allCustomers.stream() // converting the list of customer into stream of customer
				            .map(eachCustomer -> {
				            	return convertingEntityToResponse(eachCustomer);
				             }) //It will transform the customer object into customeresponse object
							.collect(Collectors.toList()); //collecting each customerresponse object into list object
		
		return allCustomerResponse;
	}
	
	//utility method for converting customerRequest to Entity Object
	private Customer convertingFromRequestToEntity(CustomerRequest customerRequest) {
		Customer customer = modelMapper.map(customerRequest,Customer.class);
		System.out.println("Customer::::" + customer);
		return this.modelMapper.map(customerRequest,Customer.class);
	}
	
	//utility method for converting customerRequest to Entity Object
	private CustomerResponse convertingEntityToResponse(Customer customer) {
		CustomerResponse custResponse = this.modelMapper.map(customer,CustomerResponse.class);
		System.out.println("CustomerResponse::::" + custResponse.getCreatedDate());
		return custResponse;
	}
	
	//calling the Address microservice to Fetch Address of particular Customer
	private AddressResponse callingAddressServiceWithRestTemplate(int customerId) {
		//http://localhost:9966/api/address/
		System.out.println("Address Service URL:::" + addressServiceUrl);
		ResponseEntity<AddressResponse> addressResponseEntity = 
				restTemplate.getForEntity(addressServiceUrl+"customer/{customerId}",
					   			          AddressResponse.class,
								          customerId
								         );
		
		//By Using exchange() of RestTemplate
		/*ResponseEntity<AddressResponse> addressResponseEntity = 
				restTemplate.exchange(addressServiceUrl+"customer/{customerId}", 
							  HttpMethod.GET,
							  null,
							  AddressResponse.class,
							  customerId);*/
		
		//checking the API Status
		if(addressResponseEntity.getStatusCode() == HttpStatus.OK) {
			//ResponseBody of API
			if(addressResponseEntity.hasBody()) {
				return addressResponseEntity.getBody();
			}
		}
		return null;
	}
}

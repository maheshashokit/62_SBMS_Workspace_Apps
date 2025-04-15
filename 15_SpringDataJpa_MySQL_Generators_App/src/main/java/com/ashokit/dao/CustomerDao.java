package com.ashokit.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entities.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}

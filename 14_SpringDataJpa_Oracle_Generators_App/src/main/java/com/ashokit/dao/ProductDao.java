package com.ashokit.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entities.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}

package com.nosql.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nosql.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
	
	public Customer findByFirstname(String firstname);
	public List<Customer> findByLastname(String lastname);

}

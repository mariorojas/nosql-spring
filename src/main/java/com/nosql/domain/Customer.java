package com.nosql.domain;

import java.io.Serializable;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String firstname;
	private String lastname;
	
	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
}

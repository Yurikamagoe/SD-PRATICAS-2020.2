package com.example.crateus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.crateus.model.Person;

public class RestClient {


	
	private static final String CREATE = "http://localhost:8080/api/people";
	
	static RestTemplate rest = new RestTemplate();

	
	public static void createPerson(Person person) {
		ResponseEntity<Person> p = rest.postForEntity(CREATE, person, Person.class);
		System.out.println(p.getBody());
	}
	
	

}

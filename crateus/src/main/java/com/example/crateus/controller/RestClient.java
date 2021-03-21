package com.example.crateus.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.crateus.model.Person;

public class RestClient {


	
	private static final String CREATE = "http://localhost:8080/api/people";
	private static final String GET_PERSON_BY_ID= "http://localhost:8080/api/people/{id}";
	private static final String SEND_MESSAGE= "rmi://127.0.0.1:32001/Message";
	
	static RestTemplate rest = new RestTemplate();

	
	public static void createPerson(Person person) {
		ResponseEntity<Person> p = rest.postForEntity(CREATE, person, Person.class);
		System.out.println(p.getBody());
	}
	
	public static Person getPersonById(int id) {
		Map<String, Integer> param = new HashMap<>();
		param.put("id", id);
		Person person = rest.getForObject(GET_PERSON_BY_ID, Person.class, param);
		
		return person;
	}
	
	public static void SendMessage(String message) {
		ResponseEntity<String> p = rest.postForEntity(SEND_MESSAGE, message, String.class);
		System.out.println(p.getBody());
	}
	
	
	

}

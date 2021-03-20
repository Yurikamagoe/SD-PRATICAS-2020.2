package com.example.crateus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.crateus.model.Person;
import com.example.crateus.service.PersonService;

@RestController
@RequestMapping(path = "/api/people")
public class PersonController {
	
	@Autowired
	PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Person>> getPerson() {
        return new ResponseEntity<List<Person>>(personService.getPeople(), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public ResponseEntity<Person> getUser(@PathVariable("id") Integer id) {
        return new ResponseEntity<Person>(personService.getPerson(id), HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Person> addUser(@RequestBody Person person) {
        return new ResponseEntity<Person>(personService.addPerson(new Person(-1, person.getName(), person.getAge())),
                HttpStatus.OK);
    }
 
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public ResponseEntity<Person> updateUser(@PathVariable("id") Integer id, @RequestBody Person person) {
        return new ResponseEntity<Person>(personService.updatePerson(id, person.getName(), person.getAge()), HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id) {
        if(personService.removePerson(id)) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);         
        }
 
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);          
    }
}
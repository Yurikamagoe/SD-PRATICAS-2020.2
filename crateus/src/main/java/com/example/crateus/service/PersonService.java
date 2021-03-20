package com.example.crateus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crateus.model.Person;
import com.example.crateus.repository.PersonRepo;

@Service
public class PersonService {

	@Autowired
	PersonRepo personRepo;
	
	public Person addPerson(Person Person) {
        return personRepo.save(Person);
    }
    
    public boolean removePerson(Integer id) {
        if(personRepo.existsById(id)) {
            personRepo.deleteById(id);
            return true;
        }
        
        return false;
    }
    
    public List<Person> getPeople() {
        return personRepo.findAll();
    }
    
    public Person getPerson(Integer id) {
        return personRepo.findById(id).get();
    }
    
    public Person updatePerson(Integer id, String name, int age) {
        Person personAux = personRepo.findById(id).get();
        
        if(personAux != null) {
            personAux.setName(name);
            personAux.setAge(age);;
            personRepo.save(personAux);         
        }
        
        return personAux;
    }
}

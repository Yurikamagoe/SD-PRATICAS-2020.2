package com.example.crateus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crateus.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

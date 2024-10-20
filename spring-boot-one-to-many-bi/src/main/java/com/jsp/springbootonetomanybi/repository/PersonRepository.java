package com.jsp.springbootonetomanybi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootonetomanybi.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
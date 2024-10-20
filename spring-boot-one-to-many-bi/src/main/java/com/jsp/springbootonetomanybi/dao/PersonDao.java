package com.jsp.springbootonetomanybi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomanybi.dto.Person;
import com.jsp.springbootonetomanybi.repository.PersonRepository;

@Repository
public class PersonDao {
	
	@Autowired
	private PersonRepository personRepository;

	//getDetailsByPersonId
	public Person getCarPersonByPersonIdDao(int personId) {
		Optional<Person> optional = personRepository.findById(personId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}
}

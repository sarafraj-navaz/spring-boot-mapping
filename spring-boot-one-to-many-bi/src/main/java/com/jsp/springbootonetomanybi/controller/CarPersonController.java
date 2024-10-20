package com.jsp.springbootonetomanybi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootonetomanybi.dto.Car;
import com.jsp.springbootonetomanybi.dto.Person;
import com.jsp.springbootonetomanybi.service.CarPersonService;

@RestController
public class CarPersonController {
//jackson json<=>java
	@Autowired
	private CarPersonService service;

	// saveCarPerson
	@PostMapping(value = "/saveCarPerson")
	public List<Car> saveCarPersonController(@RequestBody List<Car> cars) {
		return service.saveCarPersonService(cars);
	}

	// getDetailsByPersonId
	@GetMapping(value = "/getCarPersonByPersonId/{personId}")
	public Person getCarPersonByPersonIdController(@PathVariable int personId) {
		return service.getCarPersonByPersonIdService(personId);
	}

	// updateCarNameByPersonId
	@PutMapping(value = "/updateCarNameByPersonId/{personId}/{carName}")
	public Person updateCarNameByPersonId(@PathVariable int personId,@PathVariable String carName) {
		return service.updateCarNameByPersonId(personId, carName);				
	}

}

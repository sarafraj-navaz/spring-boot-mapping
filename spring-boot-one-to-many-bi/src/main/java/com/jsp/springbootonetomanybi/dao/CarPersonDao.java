package com.jsp.springbootonetomanybi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootonetomanybi.dto.Car;
import com.jsp.springbootonetomanybi.dto.Person;
import com.jsp.springbootonetomanybi.repository.CarRepository;
import com.jsp.springbootonetomanybi.repository.PersonRepository;

@Repository
public class CarPersonDao {

	@Autowired
	private CarRepository carRepository;
	
//	@Autowired
//	private PersonRepository personRepository;
	
	@Autowired
	public PersonDao personDao;
	
	//saveCarPerson
	public List<Car> saveCarPersonDao(List<Car> cars) {
		return carRepository.saveAll(cars);
	}
	
	//updateCarNameByPersonId
	public Person updateCarNameByPersonId(int personId, String carName) {
		Person person = personDao.getCarPersonByPersonIdDao(personId);
		if(person != null) {
			List<Car> cars = person.getCars();
			for(Car car : cars) {
				car.setCarName(carName);
			}
		}
		return person;		
	}
}

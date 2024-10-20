package com.jsp.springbootonetomanybi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootonetomanybi.dao.CarPersonDao;
import com.jsp.springbootonetomanybi.dao.PersonDao;
import com.jsp.springbootonetomanybi.dto.Car;
import com.jsp.springbootonetomanybi.dto.Person;

@Service
public class CarPersonService {

	@Autowired
	private CarPersonDao dao;

	@Autowired
	private PersonDao personDao;

	// saveCarPerson
	public List<Car> saveCarPersonService(List<Car> cars) {
		return dao.saveCarPersonDao(cars);
	}

	// getDetailsByPersonId
	public Person getCarPersonByPersonIdService(int personId) {
		return personDao.getCarPersonByPersonIdDao(personId);
	}
	
	//updateCarNameByPersonId
		public Person updateCarNameByPersonId(int personId, String carName) {
			return dao.updateCarNameByPersonId(personId, carName);
		}

}

package com.jsp.one_to_one_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.one_to_one_spring_boot.dao.EmployeeLaptopDao;
import com.jsp.one_to_one_spring_boot.dto.Employee;

@Service
public class EmployeeLaptopService {
	
	@Autowired
	private EmployeeLaptopDao dao;
	
	ResponseEntity<Employee> entity;
	
	public ResponseEntity<Employee> saveEmployeeLaptopService(Employee employee) {
		Employee employee2=dao.saveEmployeeLaptopDao(employee);
		if(employee2 != null) {
			entity=ResponseEntity.status(HttpStatus.ACCEPTED).body(employee);
			System.out.println("DATA  STORED");
		}
		else {
			entity= ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);;
			System.out.println("FAILED");
		}
		return entity;
	}
}

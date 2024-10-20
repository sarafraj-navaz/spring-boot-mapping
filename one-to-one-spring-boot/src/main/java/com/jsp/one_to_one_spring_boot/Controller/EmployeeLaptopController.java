package com.jsp.one_to_one_spring_boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.one_to_one_spring_boot.dto.Employee;
import com.jsp.one_to_one_spring_boot.service.EmployeeLaptopService;

@RestController
public class EmployeeLaptopController {
	
	@Autowired
	private EmployeeLaptopService employeeLaptopService;
	
	@PostMapping("/saveEmployeeLaptopDataAPI")
	public ResponseEntity<Employee> saveEmployeeLaptopService(Employee employee) {
		return employeeLaptopService.saveEmployeeLaptopService(employee);
	}
}

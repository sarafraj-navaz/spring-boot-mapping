package com.jsp.one_to_one_spring_boot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.one_to_one_spring_boot.dto.Employee;
import com.jsp.one_to_one_spring_boot.repository.EmployeeRepository;

@Repository
public class EmployeeLaptopDao {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployeeLaptopDao(Employee employee) {
		return employeeRepository.save(employee);
	}
}

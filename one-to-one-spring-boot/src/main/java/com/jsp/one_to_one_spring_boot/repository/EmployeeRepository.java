package com.jsp.one_to_one_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.one_to_one_spring_boot.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

package com.jsp.springbootonetomanybi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootonetomanybi.dto.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}

package com.jsp.springbootonetomanybi.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

	@Id
	private int carId;
	private String carName;
	private String carColor;
	private double carPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id")
	@JsonBackReference
	private Person person;
}

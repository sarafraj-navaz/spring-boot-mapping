package com.jsp.springbootonetomanybi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@Id
	private int personId;
	private String personName;
	private String personAddress;
	
	@OneToMany(mappedBy = "person")
	@JsonManagedReference
	private List<Car> cars;
}

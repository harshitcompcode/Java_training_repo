package com.graymatter.entities;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	
	@Id
	private int empId;
	
	@Size(min = 3, message = "person must be more than 3 chars length")
    @Column(name = "personName")
	private String empName;
	
	
	private double empSal;
	
	@Range(min = 18, max = 150, message = "Employee age must be between 18 and 150")
	private Integer empAge;
	
	
	
	
}

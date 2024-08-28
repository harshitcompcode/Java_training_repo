package com.graymatter.entities;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter




@Table(name = "project23Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private double empSal;
	private String city;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptId",referencedColumnName= "deptId")
	private Department department;
	
	
	
	
	
	
	
	
}

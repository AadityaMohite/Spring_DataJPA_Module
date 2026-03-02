package com.Aadi.entity;

import org.hibernate.annotations.AnyDiscriminatorImplicitValues.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="employees")
@Data
@NoArgsConstructor
public class Employee {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private Double salary;
	private String gender;
	private String dep;
	
	
	public Employee(String name, String address, double salary, String gender, String dep) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.gender = gender;
		this.dep = dep;
	}
	
}

package com.example.employeeapp.entity;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "name cant be blank")
	private String name;
	
	@Email(message = "Invalid email format")
	@NotBlank(message = "Email cant be blank")
	private String email;
	
	@NotNull(message = "salary cant be null")
	@Positive(message = "salary should be positive")
	private Double salary;
	
}

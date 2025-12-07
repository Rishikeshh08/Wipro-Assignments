package com.example.employeeapp.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeapp.entity.Employee;
//import com.example.employeeapp.exception.IdNotFoundWhileUpdating;
import com.example.employeeapp.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class HomeController {
	
	@Autowired
	EmployeeService ser;
	
	@PostMapping("/")
	public ResponseEntity<Employee> addemp(@Valid @RequestBody Employee employee){
		Employee emp = ser.saveEmployees(employee);
		return ResponseEntity.status(HttpStatus.CREATED)
							 .body(emp);
	}
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getall() {
		List<Employee> list = ser.getAllEmployee();
		return ResponseEntity.status(HttpStatus.OK)
							 .body(list);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getbyid(@PathVariable Long id){
		Employee emp = ser.getEmployeeById(id);
		if(emp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
								 .build();
		}
		return ResponseEntity.status(HttpStatus.OK)
							 .body(emp);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteemp(@PathVariable Long id){
		boolean exist = ser.deleteEmployee(id);
		if(!exist) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
								.build();
		}
		return ResponseEntity.status(HttpStatus.OK)
							 .body("deleted successfully");
	}
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateemp(@PathVariable Long id,@Valid @RequestBody Employee emp) {
		Employee e = ser.updateEmployee(id, emp);
		
		// not require since this possibilty is handled by customexception
//		if(e == null) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND)
//								 .build();
//		}
		
		return ResponseEntity.status(HttpStatus.OK)
				 			 .body(e);
	}
}

package com.example.employeeapp.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeeapp.entity.Employee;
import com.example.employeeapp.exception.IdNotFoundWhileUpdating;
import com.example.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public Employee saveEmployees(Employee employee){
		return repo.save(employee);    // returns emp obj
	}
	public List<Employee> getAllEmployee(){
		return repo.findAll();               // return Optional<T>
	}
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);         // Optional<T> , Employee here since unique id here
	}
	
	public Boolean deleteEmployee(Long id) {
		Employee emp = repo.findById(id).orElse(null);
		if(emp == null) {
			return false;
		}
		repo.deleteById(id);
		return true;
	}
	
	
	//this is updated for exception
	public Employee updateEmployee(Long id, Employee employee) {
		Employee emp = repo.findById(id).orElse(null);
		
		if(emp == null) {
			 throw new IdNotFoundWhileUpdating("id already exists");
		}
		
		emp.setName(employee.getName());
		emp.setEmail(employee.getEmail());
		emp.setSalary(employee.getSalary());
		return emp;
	}
}

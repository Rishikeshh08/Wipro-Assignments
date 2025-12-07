package com.springboot.LectureFirstSpringProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.LectureFirstSpringProject.entity.Employee;

//Jpa Repository provides all the basic crud operation like create, update, delete and get and also provide the pagination 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

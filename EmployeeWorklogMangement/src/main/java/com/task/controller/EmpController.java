package com.task.controller;

import java.time.LocalDate;
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

import com.task.entity.Emp;
import com.task.entity.Priority;
import com.task.entity.Status;
import com.task.service.EmpService;

import jakarta.validation.Valid;

//import ch.qos.logback.core.status.Status;


@RestController
@RequestMapping("/task")
public class EmpController {
	
	@Autowired
	EmpService ser;
	
	@PostMapping("/")
	public ResponseEntity<Emp> addTask(@Valid @RequestBody Emp task) {
		Emp t =  ser.addTask(task);
		return ResponseEntity.status(HttpStatus.CREATED)
								.body(t);
	}
	
	@PutMapping("/")
	public ResponseEntity<Emp> updateTask(@Valid @RequestBody Emp newtask) {
		Integer id = newtask.getId();
		Emp t = ser.updateTask(id, newtask);
		if(t == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
									.build();
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(t);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Emp> deleteTask(@PathVariable Integer id) {
		Boolean t = ser.deleteTask(id);
		if(t == false) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
									.build();
		}
		return ResponseEntity.status(HttpStatus.OK)
				.build();
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Emp>> getall(){
		List<Emp> list =  ser.getall();
		return ResponseEntity.status(HttpStatus.OK)
				.body(list);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Emp>> findByStatusIgnoreCase(@PathVariable String statusStr) {
		Status status = Status.valueOf(statusStr.toUpperCase());  // string to Status, valueOf - prop of enum
		List<Emp> list =  ser.findByStatusIgnoreCase(status);
		return ResponseEntity.status(HttpStatus.OK)
				.body(list);
	}
	
	@GetMapping("/priority/{priority}")
	public ResponseEntity<List<Emp>> findByPriorityIgnoreCase(@PathVariable String priorityStr){
		Priority priority = Priority.valueOf(priorityStr.toUpperCase());
		List<Emp> list =  ser.findByPriorityIgnoreCase(priority);
		return ResponseEntity.status(HttpStatus.OK)
				.body(list);
	}
	
	@GetMapping("/overdue")
	public ResponseEntity<List<Emp>> findByDueDateBeforeAndStatusNot(){
		LocalDate dueDate = LocalDate.now();
		Status status = Status.valueOf("COMPLETED");
		List<Emp> list =  ser.findByDueDateBeforeAndStatusNot(dueDate, status);
		return ResponseEntity.status(HttpStatus.OK)
				.body(list);
	}
}

package com.task.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entity.Emp;
import com.task.entity.Priority;
import com.task.entity.Status;
import com.task.repository.EmpRepository;

//import ch.qos.logback.core.status.Status;


@Service
public class EmpService {
	
	@Autowired
	EmpRepository repo;
	
	public Emp addTask(Emp task) {
		return repo.save( task);
	}
	public Emp updateTask(Integer id, Emp newtask) {
		Emp t = repo.findById(id).orElse(null);
		if(t == null) {
			return null;
		}
		t.setTitle(newtask.getTitle());
		t.setStatus(newtask.getStatus());
		t.setPriority(newtask.getPriority());
		t.setDueDate(newtask.getDueDate());
		t.setDescription(newtask.getDescription());
		t.setAssignedTo(newtask.getAssignedTo());
		return t;
	}
	public boolean deleteTask(Integer id) {
		Emp task = repo.findById(id).orElse(null);
		if(task == null) {
			return false;
		}
		repo.deleteById(id);
		return true;
	}
	public List<Emp> getall(){
		return repo.findAll();
	}
	public List<Emp> findByStatusIgnoreCase(Status status) {
		return repo.findByStatusIgnoreCase(status);
	}
	public List<Emp> findByPriorityIgnoreCase(Priority priority){
		return repo.findByPriorityIgnoreCase(priority);
	}
	public List<Emp> findByDueDateBeforeAndStatusNot(LocalDate dueDate, Status status){
		return repo.findByDueDateBeforeAndStatusNot(dueDate, status);
	}
}

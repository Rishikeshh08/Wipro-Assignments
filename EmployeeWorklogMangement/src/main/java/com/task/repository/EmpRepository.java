package com.task.repository;

import java.time.LocalDate; 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.Emp;
import com.task.entity.Priority;
import com.task.entity.Status;

//import ch.qos.logback.core.status.Status;

public interface EmpRepository extends JpaRepository<Emp, Integer>{
	public List<Emp> findByStatusIgnoreCase(Status status);
	public List<Emp> findByPriorityIgnoreCase(Priority priority);
	public List<Emp> findByDueDateBeforeAndStatusNot(LocalDate dueDate, Status status);
}

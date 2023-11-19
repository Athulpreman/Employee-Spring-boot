package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.model.Employee;
import com.example.emp.repository.EmployeeRepository;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository emprep;
	
	//get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return emprep.findAll();
	}
	
	//create employee
	@PostMapping("/employees")
	public Employee createEmployees(@RequestBody Employee employee)
	{
		return emprep.save(employee);
	}
}

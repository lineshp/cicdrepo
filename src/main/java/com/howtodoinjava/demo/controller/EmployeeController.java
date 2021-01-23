package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor;
import com.howtodoinjava.demo.model.Employee;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeController {
	
	@RequestMapping("/test")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"lokesh","gupta","howtodoinjava@gmail.com"));
		return employeesList;
    }
	
	@RequestMapping("/api/myName")
	public String getMyName() {
		return "linesh";
	}

}

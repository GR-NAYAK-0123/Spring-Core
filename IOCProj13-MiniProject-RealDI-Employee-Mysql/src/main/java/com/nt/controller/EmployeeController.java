package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController {
	@Autowired
	private IEmployeeService empService;
	
	public String employeeRegistration(Employee emp) throws Exception {
		String result = empService.register(emp);
		return result;
	}
}

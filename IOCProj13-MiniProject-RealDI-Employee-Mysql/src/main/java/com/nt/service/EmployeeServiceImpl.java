package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeDAO empDAO;
	
	@Override
	public String register(Employee emp) throws Exception {
		double taxAmount = (emp.getTax() * emp.getBasicSal()) / 100;
		double finalSal = emp.getBasicSal() - taxAmount;
		emp.setFinalSal(finalSal);
		int count = empDAO.insert(emp);
		return (count==0) ? "Employee Registration Failed" : "Registration has Successfully with deducted tax amount : "+taxAmount+" and Final Salary Amount : "+finalSal;
	}

}

package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Customer;
import com.nt.service.ICustomerService;

@Controller("custController")
public class CustomerController {
	@Autowired
	private ICustomerService custService;
	
	public String process(Customer customer) throws Exception{
		//Calling the register method by using custService
		String resultMsg = custService.registerCustomer(customer);
		return resultMsg;
	}
}

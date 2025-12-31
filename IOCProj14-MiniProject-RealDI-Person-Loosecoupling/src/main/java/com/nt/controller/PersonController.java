package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Person;
import com.nt.service.IPersonService;

@Controller("person-controller")
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	public String personRegistration(Person person) throws Exception {
		String result = personService.register(person);
		return result;
	}
}

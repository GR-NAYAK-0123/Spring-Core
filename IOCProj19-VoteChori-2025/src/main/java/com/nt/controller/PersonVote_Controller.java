package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Person;
import com.nt.service.IPersonVote_Service;

@Controller("person-controller")
public class PersonVote_Controller {
	@Autowired
	private IPersonVote_Service personService;
	
	public String voting(Person person) throws Exception{
		String msg = personService.register(person);
		return msg;
	}
}

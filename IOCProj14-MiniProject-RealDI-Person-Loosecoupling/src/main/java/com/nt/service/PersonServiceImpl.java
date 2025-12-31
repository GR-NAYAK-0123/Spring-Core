package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IPersonDAO;
import com.nt.model.Person;

@Service("person-service")
public class PersonServiceImpl implements IPersonService {
	@Autowired
	//@Qualifier("dao")
	private IPersonDAO personDAO;
	
	@Override
	public String register(Person person) throws Exception {
		//Calculate the final Salary
		Double taxAmount = (person.getTax() * person.getBsal()) / 100;
		Double finalSalary = person.getBsal() - taxAmount;
		//Setting the finalSalary into the person Object
		person.setFinalsal(finalSalary);
		int count = personDAO.insert(person);
		return (count == 0) ? "Registration Failed" : "Registration has Successfully done with tax Amount : "+taxAmount+" and Final Salary : "+finalSalary;
	}

}

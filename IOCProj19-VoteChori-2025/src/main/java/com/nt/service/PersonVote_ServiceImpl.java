package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPerson_Vote_DAO;
import com.nt.model.Person;

@Service("person-service")
public class PersonVote_ServiceImpl implements IPersonVote_Service {
	@Autowired
	private IPerson_Vote_DAO personDAO;

	@Override
	public String register(Person person) throws Exception {
		int count = personDAO.insertVote(person);
		return (count == 0) ? "Registration/Vote Failed" : "Voting successfully";
	}

}

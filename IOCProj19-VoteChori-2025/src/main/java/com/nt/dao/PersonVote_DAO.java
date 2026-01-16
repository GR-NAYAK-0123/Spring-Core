package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Person;

@Repository("person-DAO")
public class PersonVote_DAO implements IPerson_Vote_DAO {
	//Inserting query
	private static final String PERSON_VOTE_INSERT_QUERY = "INSERT INTO VOTES VALUES (?,?,?)";
	
	@Autowired
	private DataSource ds;

	@Override
	public int insertVote(Person person) throws Exception {
		int count = 0;
		try(Connection con = ds.getConnection();
				        PreparedStatement pstm = con.prepareStatement(PERSON_VOTE_INSERT_QUERY)){
			pstm.setInt(1, person.getBjp());
			pstm.setInt(2, person.getCong());
			pstm.setInt(3, person.getBjd());
			
			count = pstm.executeUpdate();
			
		}
		catch(SQLException se) {    //Exception propagation
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {      //Exception propagation
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.model.Person;

@Repository("person-sql-DAO")
public class PersonDAOImpl_sql implements IPersonDAO {
	//Query for Inserting into the SQL table
	private static final String PERSON_INFO_INSERT_QUERY = "INSERT INTO SPRING_PERSON_INFO VALUES (?,?,?,?,?,?)";
	
	@Autowired
	//@Qualifier("db")
	private DataSource ds;
	
	@Override
	public int insert(Person person) throws Exception {
		int count = 0;
		try(Connection con = ds.getConnection();
				           PreparedStatement pstm = con.prepareStatement(PERSON_INFO_INSERT_QUERY);){
			pstm.setInt(1, person.getId());
			pstm.setString(2, person.getName());
			pstm.setString(3, person.getAddrs());
			pstm.setDouble(4, person.getBsal());
			pstm.setDouble(5, person.getTax());
			pstm.setDouble(6, person.getFinalsal());
			
			count = pstm.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

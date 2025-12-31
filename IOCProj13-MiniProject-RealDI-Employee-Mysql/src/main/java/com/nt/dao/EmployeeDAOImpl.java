package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	//Query for the inserting the value
	private static final String EMPLOYEE_INFO_INSERT_QUERY = "INSERT INTO SPRING_EMPLOYEE_INFO (name,addrs,basicsal,tax,finalsal) VALUES (?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public int insert(Employee emp) throws Exception {
		int count = 0;
		try(Connection con = ds.getConnection();
				                 PreparedStatement pstm = con.prepareStatement(EMPLOYEE_INFO_INSERT_QUERY);){
			pstm.setString(1, emp.getName());
			pstm.setString(2, emp.getAddrs());
			pstm.setDouble(3, emp.getBasicSal());
			pstm.setDouble(4, emp.getTax());
			pstm.setDouble(5, emp.getFinalSal());
			
			count = pstm.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();    //Exception Propagation
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();   //Exception Propagation
			throw e;
		}
		return count;
	} // insert

} //class

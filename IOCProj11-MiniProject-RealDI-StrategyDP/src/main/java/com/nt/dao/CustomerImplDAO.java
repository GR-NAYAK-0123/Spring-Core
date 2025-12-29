package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Customer;

@Repository("custDAO")
public class CustomerImplDAO implements ICustomerDAO {
	private static final String CUSTOMER_INFO_INSERT_QUERY = "INSERT INTO SPRING_CUSTOMER_INFO VALUES (?,?,?,?,?,?)";
	
	//Dependency Injection (Field Injection)
	@Autowired
	private DataSource ds;    
	
	@Override
	public int insert(Customer customer) throws Exception {
		int count = 0;
		try(Connection con = ds.getConnection();  // This is try block with resources
				PreparedStatement pstm = con.prepareStatement(CUSTOMER_INFO_INSERT_QUERY)){
			pstm.setInt(1, customer.getCno());
			pstm.setString(2, customer.getCname());
			pstm.setString(3, customer.getCadd());
			pstm.setDouble(4, customer.getBillamount());
			pstm.setDouble(5, customer.getDiscount());
			pstm.setDouble(6, customer.getFinalamount());
			
			count = pstm.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();     //Exception propagation
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();   //Exception propagation
			throw e;
		}
		return count;
	}  //method

} //class

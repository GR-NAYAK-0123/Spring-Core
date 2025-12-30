package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.Model.Student;

@Repository("studentDAO")
public class StudentDAOImp implements IStudentDAO {
	//Query for Inserting 
	private static final String STUDENT_INFO_INSERT_QUERY = "INSERT INTO SPRING_STUDENT_INFO VALUES (?,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public int insert(Student studnt) throws Exception {
		int count = 0;
		try(Connection con = ds.getConnection();
				           PreparedStatement pstm = con.prepareStatement(STUDENT_INFO_INSERT_QUERY);){
			//Setting the values
			pstm.setInt(1, studnt.getRollno());
			pstm.setString(2, studnt.getName());
			pstm.setString(3, studnt.getAddrs());
			pstm.setDouble(4, studnt.getJava());
			pstm.setDouble(5, studnt.getSpring());
			pstm.setDouble(6, studnt.getAvg());
			
			count = pstm.executeUpdate();
		}
		catch(SQLException se) {   //Exception Propagation
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {    //Exception Propagation
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

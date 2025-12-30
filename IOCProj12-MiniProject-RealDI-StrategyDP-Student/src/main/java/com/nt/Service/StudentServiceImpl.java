package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IStudentDAO;
import com.nt.Model.Student;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDAO stuDAO;
	
	@Override
	public String register(Student student) throws Exception {
		//Calculating the average of both the subject
		double average = (student.getJava() + student.getSpring()) / 2;
		//Setting the average to the student object
		student.setAvg(average);
		//Calling the insert method by using stuDAO
		int count = stuDAO.insert(student);
		return (count==0) ? "Registration Failed" : "Registration Successfully with Average mark : "+average;
	}

}

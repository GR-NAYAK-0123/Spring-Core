package com.nt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.Model.Student;
import com.nt.Service.IStudentService;

@Controller("student-controller")
public class StudentController {
	@Autowired
	private IStudentService studentServ;
	
	public String studentRegistration(Student student) throws Exception {
		String result = studentServ.register(student);
		return result;
	}
}

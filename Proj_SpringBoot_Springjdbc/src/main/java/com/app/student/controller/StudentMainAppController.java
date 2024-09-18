package com.app.student.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.app.student.service.StudentService;


@Controller("mainController")
public class StudentMainAppController {
	
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public int fetchTotalNoOfStudents() throws Exception{
		
		return studentService.getTotalStudents();
	}
	
	public String fetchStudentName(int id) throws Exception{
		
		return studentService.getNameById(id);
	}
		
	public Map<String, Object> fetStudentDetails(int id) throws Exception{
		return studentService.getStudentDetailsById(id);
		
	}
	
	public List<Map<String,Object>> fetStudentsDetails(String courseName) throws Exception{
		return studentService.getStudentsByCouseName(courseName);
	}
	
}

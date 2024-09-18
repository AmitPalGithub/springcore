package com.student.controller;

import java.util.List;
import java.util.Map;

import com.student.service.StudentService;



public class StudentMainAppController {
	
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

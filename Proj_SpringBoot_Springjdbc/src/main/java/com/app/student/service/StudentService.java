package com.app.student.service;

import java.util.List;
import java.util.Map;


public interface StudentService {

//	List<StudentDto> getAllStudentRecords() throws Exception;
	
	public int getTotalStudents() throws Exception;
	
	public String getNameById(int id) throws Exception;
	
	public Map<String, Object> getStudentDetailsById(int id)  throws Exception;

	public List<Map<String, Object>> getStudentsByCouseName(String courseName) throws Exception;
	
}

package com.app.student.dao;

import java.util.List;
import java.util.Map;

public interface StudentDao {
	

//	public List<StudentEntity> getAllStudents() throws Exception ;
	
	public int getTotalNoOfStudents() throws Exception;
	
	public String getStudentNameById(int id) throws Exception;

	public Map<String, Object> getStudentDetailsById(int id) throws Exception;
	
	public List<Map<String,Object>> getAllStudentsByCouseName(String courseName) throws Exception;
}

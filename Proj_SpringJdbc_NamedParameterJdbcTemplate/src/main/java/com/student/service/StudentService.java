package com.student.service;

import java.util.List;

import com.student.dto.StudentDto;

public interface StudentService {
	
	public String getStudentName(int id) throws Exception;
	public List<StudentDto> getStudentDetailsByCourse(String c1, String c2, String c3) throws Exception;
	
	public int registerNewStudent(StudentDto dto) throws Exception;
}

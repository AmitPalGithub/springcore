package com.student.service;

import java.util.List;

import com.student.dto.StudentDto;


public interface StudentService {

	List<StudentDto> getAllStudentRecords() throws Exception;
	
}

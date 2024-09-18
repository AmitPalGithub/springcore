package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.student.dao.StudentDao;
import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;

public class StudentServiceImpl implements StudentService {

	
	private StudentDao studentDao;
	
	
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	@Override
	public List<StudentDto> getAllStudentRecords() throws Exception {
		
		List<StudentEntity> studentList = studentDao.getAllStudents();
		
		 List<StudentDto> studentDtoList = new ArrayList<StudentDto>();
		
		
		//convert the student entity to student dto;
			
		 studentList.forEach(entity ->{
				StudentDto dto = new StudentDto();
				BeanUtils.copyProperties(entity, dto);
				studentDtoList.add(dto);
			});
		
		

		return studentDtoList;
	}

}

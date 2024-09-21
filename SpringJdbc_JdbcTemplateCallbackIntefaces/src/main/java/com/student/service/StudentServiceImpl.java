package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	
	@SuppressWarnings("null")
	@Override
	public StudentDto getStudentDetailsById(int id) throws Exception {
		
		StudentDto dto = null;
		dto= new StudentDto();
		
		StudentEntity entity = studentDao.getStudentById(id);
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setCourse_name(entity.getCourse_name());
		dto.setObtained_marks(entity.getObtained_marks());
		dto.setGrade(entity.getGrade());
		
		return dto;
	}

}

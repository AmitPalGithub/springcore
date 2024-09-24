package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public String getStudentName(int id) throws Exception {
		
		return studentDao.getStudentName(id);
	}


	@Override
	public List<StudentDto> getStudentDetailsByCourse(String c1, String c2, String c3) throws Exception {
		
		List<StudentEntity> studentEntityList = studentDao.getStudentsByCourse(c1, c2, c3);
		List<StudentDto> studentDtoList = null;
		
		studentDtoList =  new ArrayList<StudentDto>();
		
		for(StudentEntity entity :  studentEntityList) {
			
			StudentDto dto = new StudentDto();
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setEmail(entity.getEmail());
			dto.setCourse_name(entity.getCourse_name());
			dto.setObtained_marks(entity.getObtained_marks());
			dto.setGrade(entity.getGrade());
			
			studentDtoList.add(dto);
		}
		return studentDtoList;
	}


	@Override
	public int registerNewStudent(StudentDto dto) throws Exception {
		
		StudentEntity entity = null;
		entity = new StudentEntity();
		String grade = null;
		
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setCourse_name(dto.getCourse_name());
		entity.setObtained_marks(dto.getObtained_marks());
		
		if(dto.getObtained_marks() >= 400) {
			grade = "A";
		}
		else if(dto.getObtained_marks() >= 350) {
			grade = "B";
		}
		else if(dto.getObtained_marks() >= 200) {
			grade = "C";
		}
		else if(dto.getObtained_marks() >= 100) {
			grade= "D";
		}
		else {
			grade = "Fail";
		}
		
		dto.setGrade(grade);
		
		entity.setGrade(dto.getGrade());
		
		int i = studentDao.registerStudent(entity);

		
		return i;
	}	
}

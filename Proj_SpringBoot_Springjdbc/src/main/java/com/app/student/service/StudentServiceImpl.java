package com.app.student.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.app.student.dao.StudentDao;


@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	@Qualifier("studentDao")
	private StudentDao studentDao;
	
	
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}



	@Override
	public int getTotalStudents() throws Exception {
		int totalNoOfStudents = 0;
		totalNoOfStudents = studentDao.getTotalNoOfStudents();
		return totalNoOfStudents;
	}



	@Override
	public String getNameById(int id) throws Exception {
		String studentName = null;
		studentName = studentDao.getStudentNameById(id);
		return studentName;
	}



	@Override
	public Map<String, Object> getStudentDetailsById(int id) throws Exception {
	
		Map<String, Object> studentDetails= null;
		studentDetails = studentDao.getStudentDetailsById(id);
		
		return studentDetails;
	}



	@Override
	public List<Map<String, Object>> getStudentsByCouseName(String courseName) throws Exception {

		return studentDao.getAllStudentsByCouseName(courseName);
		
	}


}

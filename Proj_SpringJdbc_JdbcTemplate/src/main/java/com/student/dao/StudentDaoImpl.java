package com.student.dao;





import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;



public class StudentDaoImpl implements StudentDao {

//	private final static String GET_ALL_STUDENTS="select id,name,email,password from student_details_new";
	
	private static final String COUNT_STUDENT = "select count(*) from student_details";
	private static final String GET_STUDENT_NAME = "select name from student_details where id=?";
	private static final String GET_STUDENT_DETAILS = "select id, name, email, course_name,obtained_marks,grade from student_details where id=? ";
	private static final String GET_ALL_STUDENT_DETAILS = "select * from student_details where course_name=?";

	
	private JdbcTemplate jdbcTemplate;

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public int getTotalNoOfStudents() throws Exception {
		int totalNoOfStudent = 0;
		totalNoOfStudent = jdbcTemplate.queryForObject(COUNT_STUDENT, Integer.class);
		return totalNoOfStudent;
	}


	@Override
	public String getStudentNameById(int id) throws Exception {
		
		String studentName = null;
		studentName = jdbcTemplate.queryForObject(GET_STUDENT_NAME, String.class, id);
		return studentName;
	}


	@Override
	public Map<String, Object> getStudentDetailsById(int id) throws Exception {

		Map<String, Object> studentRecord= null;
		studentRecord  =jdbcTemplate.queryForMap(GET_STUDENT_DETAILS, id);
		return studentRecord;
	}


	@Override
	public List<Map<String, Object>> getAllStudentsByCouseName(String courseName) throws Exception {

		return jdbcTemplate.queryForList(GET_ALL_STUDENT_DETAILS, courseName );
	}

}

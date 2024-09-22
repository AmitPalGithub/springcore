package com.student.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public class StudentDaoImpl2 implements StudentDao{

	
	private static final String GET_STUDENTS_BY_COURSE = "select * from student_details where course_name in(?,?,?)";
	private static final String GET_STUDENT_BY_ID = "SELECT * from student_details where id=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public StudentEntity getStudentById(int id) throws Exception {
		
		StudentEntity studentEntity = jdbcTemplate.queryForObject(
									GET_STUDENT_BY_ID, 
									new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class),
									id);
		return studentEntity;
	}
	
	

	@Override
	public List<StudentEntity> getStudentsListByCourse(String course1, String course2, String course3) throws Exception{
		
		
		
		List<StudentEntity> studentList = null;
		
		BeanPropertyRowMapper<StudentEntity> rowMapper = null;
		rowMapper = new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class);
		
		studentList = jdbcTemplate.query(
				GET_STUDENTS_BY_COURSE, 
				new RowMapperResultSetExtractor<StudentEntity>(rowMapper),
				course1, course2, course3);
		return studentList;
		
		//ResultSetExtractor<T> implementation :: Lambda Expression
		/*
		List<StudentEntity> studenEntitytList = null;
		studenEntitytList = jdbcTemplate.query(
				GET_STUDENTS_BY_COURSE, 
				
				rs->{
					List<StudentEntity> studentList = null;
					StudentEntity entity = null;

					studentList = new ArrayList<StudentEntity>();
										
					while(rs.next()) {
						//copying the result set object data to the list of entity object
						entity = new StudentEntity();
						entity.setId(rs.getInt(1));
						entity.setName(rs.getString(2));
						entity.setEmail(rs.getString(3));
						entity.setCourse_name(rs.getString(4));
						entity.setObtained_marks(rs.getInt(5));
						entity.setGrade(rs.getString(6));
												
						studentList.add(entity);
					}
					return studentList;
				}, 
				
				course1, course2, course3);
		
		return studenEntitytList;
		*/
		
		
		
		
		//ResultSetExtractor<T> implementation :: anonymous inner class
		/*
		List<StudentEntity> studentList = null;
		studentList = jdbcTemplate.query(
				GET_STUDENTS_BY_COURSE, 
				new ResultSetExtractor<List<StudentEntity>>() {
					@Override
					public List<StudentEntity> extractData(ResultSet rs)throws SQLException, DataAccessException {
						List<StudentEntity> studentList = null;
						StudentEntity entity = null;

						studentList = new ArrayList<StudentEntity>();
											
						while(rs.next()) {
							//copying the result set object data to the list of entity object
							entity = new StudentEntity();
							entity.setId(rs.getInt(1));
							entity.setName(rs.getString(2));
							entity.setEmail(rs.getString(3));
							entity.setCourse_name(rs.getString(4));
							entity.setObtained_marks(rs.getInt(5));
							entity.setGrade(rs.getString(6));
													
							studentList.add(entity);
						}
						return studentList;
					}	
				},							
				course1, course2, course3);
		
		return studentList;
		*/
		
		
		
		
		
		
		
		//using nested inner class
		/*
		List<StudentEntity> studentList = null;
		studentList  = jdbcTemplate.query(
								GET_STUDENTS_BY_COURSE, 
								new StudentExtractor(), 
								course1,course2,course3);
		
		return studentList;
		*/
	}
	
	
	
	//nested inner class
	/*
	private static class StudentExtractor implements ResultSetExtractor<List<StudentEntity>>{

		@Override
		public List<StudentEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {

			List<StudentEntity> studentList = null;
			StudentEntity entity = null;

			studentList = new ArrayList<StudentEntity>();
			
			while(rs.next()) {
				//copying the result set object data to the list of entity object
				entity = new StudentEntity();
				entity.setId(rs.getInt(1));
				entity.setName(rs.getString(2));
				entity.setEmail(rs.getString(3));
				entity.setCourse_name(rs.getString(4));
				entity.setObtained_marks(rs.getInt(5));
				entity.setGrade(rs.getString(6));
				
				studentList.add(entity);
			}
			return studentList;
		}
	}
	*/
}

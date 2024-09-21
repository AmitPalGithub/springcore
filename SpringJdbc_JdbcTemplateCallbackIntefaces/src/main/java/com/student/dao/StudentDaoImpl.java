


package com.student.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;


@Repository()
public class StudentDaoImpl implements StudentDao{
	
	
	private static final String GET_STUDENT_BY_ID="select * from student_details where id=?"; 
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public StudentEntity getStudentById(int id) throws Exception {
		
		//using spring provided pre-defined implementation class of RowMapper
		StudentEntity studentEntity = jdbcTemplate.queryForObject(
				GET_STUDENT_BY_ID,
				new BeanPropertyRowMapper<StudentEntity>(StudentEntity.class),
				id);
		
		return studentEntity;
		
		
		//lambda expression based queryForObject(---,---,---,) having RowMapper :-
		/*
		StudentEntity studentEntity = null;
		studentEntity = jdbcTemplate.queryForObject(
				GET_STUDENT_BY_ID,
				(rs, rowNum)-> {
					StudentEntity entity = null;
					entity = new StudentEntity();
					
					entity.setId(rs.getInt(1));
					entity.setName(rs.getString(2));
					entity.setEmail(rs.getString(3));
					entity.setCourse_name(rs.getString(4));
					entity.setObtained_marks(rs.getInt(5));
					entity.setGrade(rs.getString(6));
					return entity;
				}
				,id);

		return studentEntity;
		*/		
		
		
		
		//anonnymous inner class
		/*
		StudentEntity studentEntity = jdbcTemplate.queryForObject(
				GET_STUDENT_BY_ID, 
				new RowMapper<StudentEntity>() {
					@Override
					public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						StudentEntity entity = null;
						entity = new StudentEntity();
						entity.setId(rs.getInt(1));
						entity.setName(rs.getString(2));
						entity.setEmail(rs.getString(3));
						entity.setCourse_name(rs.getString(4));
						entity.setObtained_marks(rs.getInt(5));
						entity.setGrade(rs.getString(6));
						
						return entity;
					}	
				}, 
				id);
		
		return studentEntity;
		*/
	}
	
	
	
	
	//nested inner class
	/*
	private static class StudentMapper implements RowMapper<StudentEntity>{
		
		public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			StudentEntity entity = null;
			entity = new StudentEntity();
			
			entity.setId(rs.getInt(1));
			entity.setName(rs.getString(2));
			entity.setEmail(rs.getString(3));
			entity.setCourse_name(rs.getString(4));
			entity.setObtained_marks(rs.getInt(5));
			entity.setGrade(rs.getString(6));
			
			return entity;
		}	
	}
	*/

}

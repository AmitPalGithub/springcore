package com.app.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.app.student.entity.StudentEntity;
import com.mysql.cj.xdevapi.PreparableStatement;

public final class StudentDaoImpl implements StudentDao {

	
	private final static String INSERT_STUDENT = 
			"insert into student_details(id, name, email, course_name, obtained_marks, grade) values(?,?,?,?,?,?)";
	
	private DataSource dataSource;
	
	public StudentDaoImpl(DataSource datasource) {
		this.dataSource = datasource;
	}
	
	@Override
	public int saveStudent(StudentEntity entity) throws Exception {
		// save the student to the database table
		Connection con = null;
		PreparedStatement ps=null;
		con = dataSource.getConnection();
		
		ps = con.prepareStatement(INSERT_STUDENT);
		
		ps.setInt(1, entity.getId());
		ps.setString(2, entity.getName());
		ps.setString(3, entity.getEmail());
		ps.setString(4, entity.getCourseName());
		ps.setInt(5, entity.getObtMarks());
		ps.setString(6, entity.getGrade());
		
		int i = ps.executeUpdate();
		return i;
	}

}

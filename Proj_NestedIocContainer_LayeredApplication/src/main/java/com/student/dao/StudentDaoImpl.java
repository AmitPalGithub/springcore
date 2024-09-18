package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;
import com.student.entity.StudentEntity;

public class StudentDaoImpl implements StudentDao {

	private final static String GET_ALL_STUDENTS="select id,name,email,password from student_details_new";
	
	private DataSource dataSource;
	
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}




	@Override
	public List<StudentEntity> getAllStudents() throws Exception{

		Connection con = null;
//		PreparedStatement ps = null;
		ResultSet rs = null;
		List<StudentEntity> studentList = null;
		
		con = dataSource.getConnection();

		PreparedStatement ps = con.prepareStatement(GET_ALL_STUDENTS);
		rs = ps.executeQuery();
		studentList = new ArrayList<StudentEntity>();
		
		
		while(rs.next()) {
			StudentEntity entity= new StudentEntity();
			entity.setId(rs.getInt(1));
			entity.setName(rs.getString(2));
			entity.setEmail(rs.getString(3));
			entity.setPassword(rs.getString(4));
			
			
			studentList.add(entity);
		}
		
		return studentList;
	}

}

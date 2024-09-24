package com.student.dto;

import java.io.Serializable;

public class StudentDto implements Serializable {
	
	private Integer id;
	private String name;
	private String email;
	private String course_name;
	private int obtained_marks;
	private String grade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getObtained_marks() {
		return obtained_marks;
	}
	public void setObtained_marks(int obtained_marks) {
		this.obtained_marks = obtained_marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", course_name=" + course_name
				+ ", obtained_marks=" + obtained_marks + ", grade=" + grade + "]";
	}

}

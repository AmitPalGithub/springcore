package com.app.beans;

import java.util.Date;
import java.util.List;

public class Employee {
	
		private List<String> name;
		private List<Date> joiningDate;
	
		public List<String> getName() {
			return name;
		}
		public void setName(List<String> name) {
			this.name = name;
		}
		public List<Date> getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(List<Date> joiningDate) {
			this.joiningDate = joiningDate;
		}
		@Override
		public String toString() {
			
			System.out.println(name.getClass().getName());  //by default arraylist is used, if you to use perticular list then explicitly mention
			return "Employee [name=" + name + ", joiningDate=" + joiningDate + "]";
		}
		
}

package com.app.beans;

import java.util.Set;

public class User {
	
	private Set<Long> phoneNumbers;
	private Set<String> email;
	
	
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [phoneNumbers=" + phoneNumbers + ", email=" + email + "]";
	}
	

}

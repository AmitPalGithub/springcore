package com.app.bean;

public class Car {
	
	private String model;
	private String company;
	private String tyre;
	private String fuelType;
	private int enginePower;
	private String regNo;
	
	public Car() {
		System.out.println("object created");
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", tyre=" + tyre + ", fuelType=" + fuelType
				+ ", enginePower=" + enginePower + ", regNo=" + regNo + "]";
	}
	
}

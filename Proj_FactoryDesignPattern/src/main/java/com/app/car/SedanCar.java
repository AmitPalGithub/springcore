package com.app.car;

public class SedanCar implements Car {

	private SedanEngine engine;
	
	public SedanCar(SedanEngine engine) {
		
		this.engine=engine;
	}
	
	public void startCar() {
		engine.startEngine();

	}


	public void moveCar() {
		System.out.println("Sedan car is moving..");

	}


	public void musicSystem() {
		System.out.println("Music is started..");

	}

}

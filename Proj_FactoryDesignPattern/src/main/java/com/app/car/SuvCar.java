package com.app.car;

public class SuvCar implements Car {

	private SuvEngine engine;
	
	public SuvCar(SuvEngine engine) {
		this.engine=engine;
	}
	
	public void startCar() {
		engine.startEngine();
		System.out.println("Car is started");
	}

	
	public void moveCar() {
		System.out.println("Luxuary car is moving..");
	}

	
	public void musicSystem() {
		System.out.println("Music is started");
	}

}

package com.app.car;

public class LuxuaryCar implements Car {

	private LuxuaryEngine engine;
	
	public LuxuaryCar(LuxuaryEngine engine)
	{
		this.engine=engine;
	}
	
	
	public void startCar() {
		engine.startEngine();
		System.out.println("Car is started.. ");

	}

	
	public void moveCar() {
		System.out.println("Luxuary car is moving..");
		
	}


	public void musicSystem() {

		System.out.println("Music is started..");
	}

}

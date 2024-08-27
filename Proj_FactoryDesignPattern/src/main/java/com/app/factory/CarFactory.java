package com.app.factory;

import com.app.car.Car;
import com.app.car.LuxuaryCar;
import com.app.car.LuxuaryEngine;
import com.app.car.SedanCar;
import com.app.car.SedanEngine;
import com.app.car.SuvCar;
import com.app.car.SuvEngine;

public class CarFactory {
	
	public static Car getCarInstance(String carType) {
		
		Car car = null;
		if(carType.equalsIgnoreCase("suv")) {
			
			car  = new SuvCar(new SuvEngine());
		}
		
		else if(carType.equalsIgnoreCase("luxuary")) {
			
			car  = new LuxuaryCar(new LuxuaryEngine());
		}
		
		else if(carType.equalsIgnoreCase("sedan")) {
			
			car  = new SedanCar(new SedanEngine());
		}
		
		else {
			throw new IllegalArgumentException("wrong car passed...");
		}
		
		return car;
	}

}

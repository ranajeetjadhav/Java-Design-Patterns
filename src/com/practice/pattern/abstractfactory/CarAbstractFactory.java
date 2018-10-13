package com.practice.pattern.abstractfactory;

import com.practice.pattern.factory.Car;
import com.practice.pattern.factory.CarType;

public class CarAbstractFactory {
	
	public static Car buildCar(CarType carType){
		Car car = null;		
		Location location = Location.ASIA;
		
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(carType);
			break;

		case ASIA:
			car = ASIACarFactory.buildCar(carType);
			break;
		default:
			//throw some exception
			break;
		}		
		return car;
	}
}

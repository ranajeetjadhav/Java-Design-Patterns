package com.practice.pattern.factory;

public class CarFactory {

	public static Car getInstance(CarType carType){
		Car car = null;
		switch(carType){
			case SMALL: 
				car = new SamllCar();
				break;
			case SEDAN :	
				car = new SedanCar();
				break;
			case LUXURY :
				car = new LuxuryCar();
				break;
			default : 
				//throw some exception
				break;
		}
		
		return car;
	}
}

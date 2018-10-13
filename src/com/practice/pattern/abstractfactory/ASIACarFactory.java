package com.practice.pattern.abstractfactory;

import com.practice.pattern.factory.Car;
import com.practice.pattern.factory.CarType;
import com.practice.pattern.factory.LuxuryCar;
import com.practice.pattern.factory.SamllCar;
import com.practice.pattern.factory.SedanCar;

public class ASIACarFactory {

	public static Car buildCar(CarType carType){
		Car car = null;
		switch(carType){
			case SMALL: 
				car = new SamllCar(Location.ASIA);
				break;
			case SEDAN :	
				car = new SedanCar(Location.ASIA);
				break;
			case LUXURY :
				car = new LuxuryCar(Location.ASIA);
				break;
			default : 
				//throw some exception
				break;
		}
		
		return car;
	}
}

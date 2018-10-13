package com.practice.pattern.abstractfactory;

import com.practice.pattern.factory.CarType;

public class TestAbstractFactory {

	public static void main(String[] args) {
		System.out.println(CarAbstractFactory.buildCar(CarType.SMALL));
		System.out.println(CarAbstractFactory.buildCar(CarType.SEDAN));
		System.out.println(CarAbstractFactory.buildCar(CarType.LUXURY));
	}

}

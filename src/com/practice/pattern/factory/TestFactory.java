package com.practice.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {
		System.out.println(CarFactory.getInstance(CarType.SMALL));
		System.out.println(CarFactory.getInstance(CarType.SEDAN));
		System.out.println(CarFactory.getInstance(CarType.LUXURY));
	}
}

package com.practice.pattern.factory;

import com.practice.pattern.abstractfactory.Location;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}
	
	public SedanCar(Location location) {
		super(CarType.SEDAN,location);		
		construct();
		System.out.println(" in "+location);
	}

	@Override
	protected void construct() {
		System.out.println("construct sedan car");	
	}
}

package com.practice.pattern.factory;

import com.practice.pattern.abstractfactory.Location;

public class SamllCar extends Car {

	public SamllCar() {
		super(CarType.SMALL);
		construct();
	}
	
	public SamllCar(Location location) {
		super(CarType.SMALL,location);		
		construct();
		System.out.println(" in "+location);
	}

	@Override
	protected void construct() {
		System.out.println("construct small car");
	}
}

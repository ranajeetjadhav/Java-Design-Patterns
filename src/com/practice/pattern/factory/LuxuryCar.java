package com.practice.pattern.factory;

import com.practice.pattern.abstractfactory.Location;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	public LuxuryCar(Location location) {
		super(CarType.LUXURY,location);		
		construct();
		System.out.println(" in "+location);
	}
	
	@Override
	protected void construct() {
		System.out.println("construct luxury car");
	}
}

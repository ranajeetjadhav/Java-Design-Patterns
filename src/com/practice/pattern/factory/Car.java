package com.practice.pattern.factory;

import com.practice.pattern.abstractfactory.Location;

public abstract class Car {
	private CarType carType;
	private Location location;
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Car(Location location) {
		super();
		this.location = location;
	}

	public Car(CarType carType) {		
		this.carType = carType;
		arrangeParts();
	}
	
	public Car(CarType carType, Location location) {
		this.carType = carType;
		this.location = location;
	}

	private void arrangeParts(){
		// arrange car parts 
	} 
	
	// only declaration
	// implementation will be given in sub classes
	protected abstract void construct();
}

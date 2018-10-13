package com.practice.pattern.singleton;

public class LazySingleton {

	private static LazySingleton singletonObject = null;
	
	// to restrict instantiation
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(singletonObject == null){			
			// thread safe
			synchronized (LazySingleton.class) {
				// double check
				if(singletonObject == null){
					singletonObject = new LazySingleton();
				}
			}			
		}
		return singletonObject; 
	}
}

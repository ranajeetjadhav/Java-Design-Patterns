package com.practice.pattern.singleton;

public class TestSingletonPattern {

	public static void main(String[] args) {
		LazySingleton singletonobject = LazySingleton.getInstance();		
		System.out.println(singletonobject);
		
		LazySingleton singletonobject2 = LazySingleton.getInstance();
		System.out.println(singletonobject2);
	}

}

package com.practice.pattern.prototype;

import com.practice.pattern.prototype.PrototypeFactory.ModelType;

public class TestPrototypePattern {

	public static void main(String[] args) {
		try {
			String moviePrototype = new PrototypeFactory().getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			String showPrototype = new PrototypeFactory().getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			String albumPrototype = new PrototypeFactory().getInstance(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

package com.practice.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelType{
		public static final String  MOVIE = "movie";
		public static final String SHOW = "show";
		public static final String ALBUM = "album";
	}
	
	private static Map<String , PrototypeCapable> prototypes = new HashMap<>();
	
	static{
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.SHOW, new Show());
		prototypes.put(ModelType.ALBUM, new Album());		
	}
	
	public static PrototypeCapable getInstance(final String model) throws CloneNotSupportedException{
		return prototypes.get(model).clone();
	}
}

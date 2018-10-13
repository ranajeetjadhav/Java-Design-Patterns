package com.practice.pattern.prototype;

public interface PrototypeCapable extends Cloneable {

	public PrototypeCapable clone() throws CloneNotSupportedException;
}

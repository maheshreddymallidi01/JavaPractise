package com.practise.Generics;

public class Box<T> {

	private T type;
	
	public void setType(T type) {
		this.type = type;
	}
	
	public T getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Box type is "+type;
	}
}

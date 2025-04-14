package com.practise.Generics;

public class Util<T> {

	/* Generic Methods can be Static or Non-Static */
	public static <T> void dislayToString(T type) {
		System.out.println(type.toString());
	}
}

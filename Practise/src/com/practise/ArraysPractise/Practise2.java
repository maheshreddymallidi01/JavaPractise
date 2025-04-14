package com.practise.ArraysPractise;

import java.util.StringJoiner;

public class Practise2 {

	public static void main(String[] args) {
		StringJoiner strj1 = new StringJoiner(",","[","]");
		strj1.add("A").add("B").add("C");
		System.out.println(strj1);
		
		StringJoiner strj2 = new StringJoiner(":");
		strj2.add("P").add("Q");
		System.out.println(strj2);
		
		strj1.merge(strj2);
		System.out.println(strj1);
	}

}

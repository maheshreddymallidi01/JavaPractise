package com.practise.ArraysPractise;

import java.util.stream.IntStream;

public class Practise26 {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(sumOfMultiples(n));
	}

	private static int sumOfMultiples(int n) {
		return IntStream.rangeClosed(1, n).filter(x->x%3==0||x%5==0||x%7==0).reduce(0, (a,b)->a+b);
	}
}

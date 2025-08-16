package com.practise.Recursion;

public class RecursionPractise3 {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		int n=4;
		System.out.println(fibonacci(n));
	}
	
	private static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

package com.practise.LeetCode;

import java.util.Scanner;

public class FibanocciNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

}

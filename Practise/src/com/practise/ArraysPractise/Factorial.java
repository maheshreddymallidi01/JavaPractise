package com.practise.ArraysPractise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		factorial(n);
	}

	private static void factorial(int n) {
		System.out.println(IntStream.rangeClosed(1, n).reduce(1, (a,b)->a*b));
	}

}

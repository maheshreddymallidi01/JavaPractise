package com.practise.ArraysPractise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		/*
		 * for(int i=2;i<=n;i++) { int count= 0; for(int j=2;j<=i;j++) { if(i%j==0) {
		 * count++; } } if(count==1) { System.out.println(i+" "); } }
		 */
		
		if(IsPrime(n)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
	}

	private static boolean IsPrime(int n) {
		return IntStream.rangeClosed(2, n/2).noneMatch(i->n%i==0);
	}

	

}

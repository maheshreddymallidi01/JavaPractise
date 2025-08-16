package com.practise.Recursion;

public class RecursionPractise1 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(sumOfN(n));
		int k = 5;
		sumOfNFunctionalWay(k,0);
		int m = 5;
		System.out.println(factorial(m));
	}
	
	private static int factorial(int m) {
		if(m==1) {
			return 1;
		}
		return m*factorial(m-1);
	}
	
	private static int sumOfN(int n) {
		if(n==5) {
			return n;
		}
		return n+sumOfN(n+1);
	}
	
	private static void sumOfNFunctionalWay(int k, int n) {
		if(k<1) {
			System.out.println(n);
			return;
		}
		sumOfNFunctionalWay(k-1,n+k);
	}

}

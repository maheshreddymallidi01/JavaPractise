package com.practise.ArraysPractise;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 10;
		int temp;
		int n1 = 0;
		int n2 = 1;

		for(int i=1;i<=count;i++) {
			System.out.println(n1);
			temp = n1;
			n1 = n2;
			n2 = temp+n2;
		}
		
	}

}

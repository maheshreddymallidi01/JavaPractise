package com.practise.ArraysPractise;

import java.util.stream.IntStream;

public class Practise14 {

	public static void main(String[] args) {
		int n = 1234;
		int m = 1234;
		int rem=0,temp;
		while(n>0) {
			temp = n%10;
			rem = rem*10+temp;
			n = n/10;
		}
		System.out.println(rem);
		
		StringBuilder str = new StringBuilder(String.valueOf(m));
		int result = Integer.valueOf(str.reverse().toString());
		System.out.println(result);
		System.out.println(IntStream.iterate(m, i->i/10).limit(String.valueOf(m).length()).map(x->(int)x%10).reduce(0,(a,b)->(a*10)+b));
	}

}

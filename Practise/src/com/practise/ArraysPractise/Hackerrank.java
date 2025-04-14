package com.practise.ArraysPractise;

import java.util.Scanner;

public class Hackerrank {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		long n = scan.nextLong();
		System.out.println(repeatedString(s, n));
	}
	public static long repeatedString(String s, long n) {
	    // Write your code here
	    long count = 0;
	    String temp = s;
	    if(s.length()<n){
	        s+=temp;
	        repeatedString(s, n);
	    }else{
	        for(int i=0;i<n;i++){
	            if(s.charAt(i)=='a'){
	                count+=1;
	            }
	        }
	    }
	        return count;
	    }
}

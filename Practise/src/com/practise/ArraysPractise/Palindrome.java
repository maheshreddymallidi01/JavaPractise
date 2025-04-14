package com.practise.ArraysPractise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		int input = scan.nextInt();
		
		if(palindromeInt(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		
		if(palindrome(s1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		if(palindromeRecusrion(s1,0)) {
			System.out.println("Palindrome using Recursion");
		}else {
			System.out.println("Not a Palindrome using Recursion");
		}

	}

	private static boolean palindromeRecusrion(String s1,int i) {
		if(i<=s1.length()/2) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)) {
				return false;
			}
			palindromeRecusrion(s1, i+1);
		}
		return true;
	}

	private static boolean palindromeInt(int input) {
		String str = String.valueOf(input);
		return IntStream.rangeClosed(0, str.length()/2).noneMatch(n->str.charAt(n)!=str.charAt(str.length()-n-1));
	}

	private static boolean palindrome(String s1) {
		return IntStream.rangeClosed(0, s1.length()/2).noneMatch(m->s1.charAt(m)!=s1.charAt(s1.length()-m-1));
	}

	
}

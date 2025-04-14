package com.practise.StringPractise;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		if(anagram(s1,s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

	private static boolean anagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length) {
			return false;
		}
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
			}
		}
		return true;
	}	
}

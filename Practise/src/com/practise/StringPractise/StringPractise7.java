package com.practise.StringPractise;

import java.util.Scanner;

public class StringPractise7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))||Character.isLetter(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}

package com.practise.StringPractise;

import java.util.Scanner;

public class StringPractise4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char ch = scan.next().charAt(0);
		replaceStr(str,ch);
	}

	private static void replaceStr(String str,char ch) {
		String finalStr = "";
		for(int i=0;i<str.length();i++) {
			if(Character.toUpperCase(str.charAt(i))!=Character.toUpperCase(ch)) {
				finalStr+=str.charAt(i);
			}
		}
		System.out.println(finalStr);
	}

}

package com.practise.StringPractise;

import java.util.Scanner;

public class StringPractise2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		if(isRotation(str1,str2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean isRotation(String str1, String str2) {
		return ((str1.length()==str2.length())&&((str1+str1).indexOf(str2)!=-1));
	}

}

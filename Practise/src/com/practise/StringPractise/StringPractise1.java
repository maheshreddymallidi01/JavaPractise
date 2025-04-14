package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringPractise1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		String strRemoved = "";
		for(int i=0;i<str.length();i++) {
			if(!(Character.isDigit(str.charAt(i)))&&!(Character.isLetter(str.charAt(i)))&&!(Character.isWhitespace(str.charAt(i)))) {
				count++;
			}else {
				strRemoved = strRemoved+str.charAt(i);
			}
		}
		if(count>0) {
			System.out.println(count);
		}
		System.out.println(strRemoved);
		System.out.println(removeSpecials(str));
	}

	private static String removeSpecials(String str) {
		List<String> result = new ArrayList<>(Arrays.asList(str.split("[^A-Z-a-z]")));
		result.removeIf(String::isEmpty);
		return result.stream().collect(Collectors.joining(""));
	}

}

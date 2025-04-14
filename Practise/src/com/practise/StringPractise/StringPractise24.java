package com.practise.StringPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractise24 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	
	private static String reverseWords(String s) {
		List<String> str = Arrays.asList(s.split(" "));
		return str.stream().map(x->reverseString(x)).collect(Collectors.joining(" "));
	}
	
	private static String reverseString(String x) {
		StringBuilder string = new StringBuilder(x);
		return string.reverse().toString();
	}

}

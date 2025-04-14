package com.practise.StringPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractise {

	public static void main(String[] args) {
		char[] ch = {'m','a','h','e','s','h'};
		String str1 = new String(ch);
		String str2 = "mahesh";
		String str3 = "mahesh";
		String str4 = new String("mahesh");
		String str5 = new String("mahesh");

		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str1);
		System.out.println(str4==str5);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str1));
		str3.concat("reddy");
		System.out.println(str3);
		str5.concat("reddy");
		System.out.println(str5);
		
		StringBuilder str6 = new StringBuilder(str4);
		System.out.println(str6.reverse());
		System.out.println("MMR"+15*30);
		System.out.println("MMR"+15+30);
		System.out.println(String.valueOf(str1));
		System.out.println(String.valueOf(str2));
		System.out.println(String.valueOf(str1)==String.valueOf(str2));
		
		String[] strArray = {"mahesh","mallidi"};
		List<String> strAList = Arrays.asList(strArray);
		System.out.println(strAList);
		String strJoin = strAList.stream().collect(Collectors.joining(" "));
		System.out.println(strJoin);
		String[] strALToStr = strAList.toArray(new String[strAList.size()]);
		for(String s:strALToStr) {
			System.out.println(s);
		}
		
		String string = "mahesh";
		System.out.println(string);
		char[] chStr = string.toCharArray();
		for(char r:chStr) {
			System.out.print(r+" ");
		}
		System.out.println();
		String strToCh = String.valueOf(chStr);
		System.out.println(strToCh);
		List<Character> chAList = string.chars().mapToObj(c->(char)c).toList();
		System.out.println(chAList);
		
		System.out.println(100+100+"MMR");
		System.out.println("MMR"+100+100);
	}

}

package com.practise.StringPractise;

public class StringPractise12 {

	public static void main(String[] args) {
		String str1 = "Mahesh";
		String str2 = "Mallidi";
		
		str1 = str1+str2;//MaheshMallidi
		str2 = str1.substring(0,str1.length()-str2.length());//Mahesh
		str1 = str1.substring(str2.length());//Mallidi
		System.out.println(str1);
		System.out.println(str2);
	}

}

package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPractise3 {

	public static void main(String[] args) {
		String str = "Myself Mahesh Myself Mahesh";
		int mid = str.length()/2;
		String result = "";
		for(int i=0;i<str.length();i++) {
			if(i>=mid) {
				result = result+Character.toUpperCase(str.charAt(i));
			}else {
				result = result+Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(result);
	}

}

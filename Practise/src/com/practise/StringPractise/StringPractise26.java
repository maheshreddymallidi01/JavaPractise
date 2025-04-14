package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringPractise26 {

	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		removeSpaceAndSpecials(s);
	}

	private static void removeSpaceAndSpecials(String s) {
		List<String> str = new ArrayList<>(Arrays.asList(s.split("[^A-Z-a-z]")));
		System.out.println(str);
        str.removeAll(Collections.singleton(""));
        System.out.println(str);
        System.out.println(str.size());
        for(String r:str){
            System.out.println(r);
        }
	}

}

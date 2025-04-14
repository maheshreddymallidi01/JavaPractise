package com.practise.StringPractise;

import java.util.HashSet;
import java.util.Set;

public class StringPractise22 {

	public static void main(String[] args) {
		String[] words = {"cd","ac","dc","ca","zz"};
		System.out.println(maximumNumberOfStringPairs(words));
	}
	
	private static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> s = new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(s.contains(reverseString(words[i]))) {
            	count++;
            }else {
            	s.add(words[i]);
            }
        }
        return count;
    }

	private static String reverseString(String string) {
		StringBuilder str = new StringBuilder(string);
		return str.reverse().toString();
	}
}

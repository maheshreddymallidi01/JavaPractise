package com.practise.StringPractise;

import java.util.stream.IntStream;

public class StringPractise23 {

	public static void main(String[] args) {
		String[] words = {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	}

	private static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(palindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

	private static boolean palindrome(String string) {
		int i = 0;
        int j = string.length()-1;
        while(i<j){
          if(string.charAt(i)!=string.charAt(j)){
            return false;
          }
          i++;
          j--;
        }
        return true;
	}
}

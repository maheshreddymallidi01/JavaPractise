package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	private static boolean isPalindrome(String s) {
        List<String> str = new ArrayList<>(Arrays.asList(s.split("[^A-Z-a-z]")));
        System.out.println(str);
        str.removeAll(Collections.singleton(""));
        System.out.println(str);
        String strJoin = str.stream().collect(Collectors.joining(""));
        System.out.println(strJoin);
        StringBuilder strTemp = new StringBuilder(strJoin);
        String strResult = strTemp.reverse().toString();
        if(!strJoin.equalsIgnoreCase(strResult)){
            return false;
        }
        return true;
    }

}

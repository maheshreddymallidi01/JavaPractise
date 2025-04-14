package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise35 {

	public static void main(String[] args) {
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		int[] result = plusOne(digits);
		for(int r:result) {
			System.out.println(r);
		}
	}

	private static int[] plusOne(int[] digits) {
        int[] r = new int[digits.length];
        int sum = 0;
        for(int i=0;i<digits.length;i++){
            sum = sum*10+digits[i];
        }
        sum = sum+1;
        System.out.println(sum);
        String s = Integer.toString(sum);
        for(int j=0;j<s.length()-1;j++){
            r[j] = s.charAt(j)-'0';
        }
        return r;
    }
}

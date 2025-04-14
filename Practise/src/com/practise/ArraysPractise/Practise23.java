package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Practise23 {

	public static void main(String[] args) {
		int[] arr = {10,4,8,3};
		int[] a1 = sumOfEachLeftDigit(arr);
		int[] a2 = sumOfEachRightDigit(arr);
		int[] output = leftandRightDifference(a1,a2);
		for(int o:output) {
			System.out.println(o);
		}
	}

	private static int[] sumOfEachLeftDigit(int[] arr) {
		int[] result = new int[arr.length];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				result[i] = 0;
			}else {
				sum = sum+arr[i];
				result[i] = sum;
			}
		}
		return result;
	}
	
	private static int[] sumOfEachRightDigit(int[] arr) {
		int[] result = new int[arr.length];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				result[i] = 0;
			}else if(i==0) {
				sum = sum+arr[i];
			}
			else {
				sum = sum+arr[i];
				result[i] = sum;
			}
		}
		return result;
	}
	
	private static int[] leftandRightDifference(int[] a1, int[] a2) {
		int[] result = new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			result[i] = a1[i]-a2[i];
		}
		return result;
	}
}

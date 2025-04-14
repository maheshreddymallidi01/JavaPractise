package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practise4 {

	public static void main(String[] args) {
		int arr1[] = {8,10,20,30,35,40};
		int arr2[] = {30,40,50,1,2};
		
		printIntersection(arr1,arr2);
		printUnion(arr1,arr2);
	}

	private static void printUnion(int[] arr1, int[] arr2) {
		Set<Integer> m = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			m.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			m.add(arr2[j]);
		}
		System.out.println(m);
	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		Set<Integer> m = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			m.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			if(m.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
		}
	}

}

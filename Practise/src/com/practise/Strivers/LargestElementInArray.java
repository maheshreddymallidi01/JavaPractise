package com.practise.Strivers;

import java.util.Arrays;
import java.util.List;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(largest(arr));
		System.out.println(largestOpt(arr));
	}

	private static int largest(int[] arr) {
		List<Integer> r = Arrays.stream(arr).boxed().toList();
		return r.stream().max((x,y)->x-y).get();
	}
	
	private static int largestOpt(int[] arr) {
		int l = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(l<arr[i]) {
				l = arr[i];
			}
		}
		return l;
	}

}

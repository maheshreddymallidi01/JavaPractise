package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;

public class Practise5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,9,10};
		int sum = ((arr.length+1)*(arr.length+2))/2;
		int r = 0;
		for(int i=0;i<arr.length;i++) {
			r+=arr[i];
		}
		System.out.println(sum-r);
		
		List<Integer> l = Arrays.stream(arr).boxed().toList();
		int result = l.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum-result);
	}

}

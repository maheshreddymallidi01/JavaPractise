package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumberInList {

	public static void main(String[] args) {
		int[] arr = {3,4,5,7,55,66,8};
		List<Integer> num = Arrays.stream(arr).boxed().toList();
		System.out.println(num.stream().max(Comparator.naturalOrder()).get());
		int largest = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
		
		Arrays.sort(arr);
		int result = arr[arr.length-1];
		System.out.println(result);
		
		System.out.println(num.stream().max(Comparator.naturalOrder()).get());
	}

}

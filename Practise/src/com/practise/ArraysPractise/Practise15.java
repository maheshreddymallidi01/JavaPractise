package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise15 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {9,13,16,28,35};
		List<Integer> n1 = Arrays.stream(arr1).boxed().toList();
		List<Integer> n2 = Arrays.stream(arr2).boxed().toList();
		Stream<Integer> s = Stream.concat(n1.stream(),n2.stream());
		List<Integer> r = s.sorted().collect(Collectors.toList());
		System.out.println(r);
		
		int[] temp = new int[arr1.length+arr2.length];
		int left = 0;
		int right = 0;
		int index = 0;
		while(left<arr1.length&&right<arr2.length) {
			if(arr1[left]<=arr2[right]) {
				temp[index] = arr1[left];
				left++;
				index++;
			}
			else {
				temp[index] = arr2[right];
				right++;
				index++;
			}
		}
		while(left<arr1.length) {
			temp[index] = arr1[left];
			left++;
			index++;
		}
		while(right<arr2.length) {
			temp[index] = arr2[right];
			right++;
			index++;
		}
		for(int t:temp) {
			System.out.print(t+" ");
		}
	}

}

package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenAndOdd {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);
		List<Integer> even = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> odd = nums.stream().filter(n->n%2==1).collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);
		Map<Boolean, List<Integer>> result = nums.stream().collect(Collectors.partitioningBy(n->n%2==0));
		List<Integer> even1 = result.get(true);
		List<Integer> odd1 = result.get(false);
		System.out.println(even1);
		System.out.println(odd1);
		
		int[] numbers = nums.stream().mapToInt(Integer::intValue).toArray();
		int j=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				j++;
			}
		}
		
		for(int n:numbers) {
			System.out.print(n+" ");
		}
	}

}

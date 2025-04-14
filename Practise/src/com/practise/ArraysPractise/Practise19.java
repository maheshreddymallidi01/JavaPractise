package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Practise19 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));
	}


	private static int numIdenticalPairs(int[] nums) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

}

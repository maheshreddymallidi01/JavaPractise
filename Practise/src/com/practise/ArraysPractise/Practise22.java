package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;

public class Practise22 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,-1};
		int[] result = sumOfEachNumber(nums);
		for(int rr:result) {
			System.out.print(rr+" ");
		}
	}
	
	private static int[] sumOfEachNumber(int[] nums) {
		int[] r = new int[nums.length];
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
			r[i] = sum;
		}
		return r;
	}
}

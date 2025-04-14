package com.practise.ArraysPractise;

import java.util.Arrays;

public class Practise34 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int k = 3;
		System.out.println(maximizeSum(nums, k));
	}

	private static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        while(k>0) {
        	sum = sum+max;
        	max = max+1;
        	k--;
        }
        return sum;
    }
	
}

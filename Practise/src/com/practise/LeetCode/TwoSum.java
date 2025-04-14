package com.practise.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] r = twoSum(nums, target);
		for(int rr:r) {
			System.out.print(rr+" ");
		}
	}
	
	private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mmr = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	int n = nums[i];
        	int rem = target - n;
        	
        	if(mmr.containsKey(rem)) {
        		return new int[] {mmr.get(rem),i};
        	}
        	mmr.put(n, i);
        }
        return new int[] {};
    }

}

package com.practise.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int k = 3;
		System.out.println(subarraySum(nums, k));
	}
	
	private static int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> mmr = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mmr.put(nums[i], i);
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
        	sum += nums[i];
        	int rem = k-sum;
        	if(rem==0) {
        		count++;
        		sum = 0;
        	}
        	else if(mmr.containsKey(rem)&&mmr.get(rem)>i) {
        		count++;
        		sum = 0;
        	}
        }
        return count;
    }

}

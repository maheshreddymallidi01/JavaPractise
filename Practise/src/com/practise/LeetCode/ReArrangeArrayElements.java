package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeArrayElements {

	public static void main(String[] args) {
		int[] nums = {3,1,-2,-5,2,-4};
		int[] result = rearrangeArray(nums);
		for(int r:result) {
			System.out.print(r+" ");
		}
	}

	private static int[] rearrangeArray(int[] nums) {
		int[] ans = new int[nums.length];
        int pos = 0, neg  = 1;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]<0) {
        		ans[neg] = nums[i];
        		neg += 2;
        	}else {
        		ans[pos] = nums[i];
        		pos += 2;
        	}
        }
        
        return ans;
    }
}

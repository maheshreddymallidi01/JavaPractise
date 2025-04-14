package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
	
	private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
        	if(i!=0 && nums[i]==nums[i-1]) {
        		continue;
        	}else {
        		int j = i+1;
        		int k = n-1;
        		while(j<k) {
        			int sum = nums[i]+nums[j]+nums[k];
        			if(sum<0) {
        				j++;
        			}else if(sum>0){
        				k--;
        			}else {
        				List<Integer> s = Arrays.asList(nums[i],nums[j],nums[k]);
        				r.add(s);
        				j++;
        				k--;
        				while(j<k && nums[j]==nums[j-1]) {
        					j++;
        				}
        				while(j<k && nums[k]==nums[k+1]) {
        					k--;
        				}
        			}
        		}
        	}
        }
        return r;
    }

}

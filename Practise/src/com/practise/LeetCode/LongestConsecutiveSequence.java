package com.practise.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums = {102,4,101,1,2,3};
		System.out.println(longestConsecutive(nums));
	}

	private static int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int longest = 0;
        for(int i:s){
            if(!s.contains(i-1)){
                int c = 1;
                int x = i;
                while(s.contains(x+1)){
                    x += 1;
                    c++;
                }
                longest = Math.max(longest,c);
            }
        }
        return longest;
    }
}

package com.practise.LeetCode;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}
	
	private static int singleNumber(int[] nums) {
		int xor1 = 0;
        for(int i=0;i<nums.length;i++){
            xor1 = xor1^nums[i];
        }
        return xor1;
	}

}

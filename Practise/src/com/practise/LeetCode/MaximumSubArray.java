package com.practise.LeetCode;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	private static int maxSubArray(int[] nums) {
		//Kadane's Algorithm
        int sum = 0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }

}

package com.practise.LeetCode;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		int[] nums1 = {1,3,4,5};
		System.out.println(missingNumber(nums));
		System.out.println(missingNumberXor(nums1));
	}

	private static int missingNumberXor(int[] nums) {
		int xor1 = 0;
		int xor2 = 0;
		int n = nums.length-1;
		for(int i=0;i<n;i++) {
			xor2 = xor2^nums[i];
			xor1 = xor1^i+1;
		}
		xor1 = xor1^nums.length;
		return xor1^xor2;
	}

	private static int missingNumber(int[] nums) {
        int s = ((nums.length)*(nums.length+1))/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return s-sum;
    }
}

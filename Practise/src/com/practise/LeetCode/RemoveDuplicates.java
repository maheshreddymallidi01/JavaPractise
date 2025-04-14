package com.practise.LeetCode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3};
		System.out.println(removeDuplicates(nums));
	}

	private static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

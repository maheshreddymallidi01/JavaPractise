package com.practise.LeetCode;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k =3;
		rotate(nums,k);
		for(int n:nums) {
			System.out.print(n+" ");
		}
	}

	private static void rotate(int[] nums, int k) {
        if(k>nums.length){
            k = k%nums.length;
        }
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    private static void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}

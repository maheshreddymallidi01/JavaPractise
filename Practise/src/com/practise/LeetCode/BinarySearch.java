package com.practise.LeetCode;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {3,6,7,10,14,17};
		int target = 10;
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}

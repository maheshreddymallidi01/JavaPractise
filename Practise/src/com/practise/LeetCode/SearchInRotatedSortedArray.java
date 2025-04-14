package com.practise.LeetCode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3,3,3,3};
		int target = 1;
		System.out.println(search(nums, target));
	}

	public static boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid]&&nums[mid]==nums[high]){
                low += 1;
                high -= 1;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target&&target<=nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<=target&&target<=nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return false;
    }
}

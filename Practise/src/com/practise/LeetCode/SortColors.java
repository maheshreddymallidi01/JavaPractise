package com.practise.LeetCode;

public class SortColors {

	public static void main(String[] args) {
		int[] nums = {0,1,1,0,2,1,2,0};
		sortColors(nums);
		for(int n:nums) {
			System.out.print(n+" ");
		}
	}
	
	private static void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

}

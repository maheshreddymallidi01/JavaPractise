package com.practise.ArraysPractise;

public class Practise29 {

	public static void main(String[] args) {
		int nums[] = {1,15,6,3};
		System.out.println(differenceOfSum(nums));
	}
	
	private static int differenceOfSum(int[] nums) {
        int e = 0;
        int d = 0;
        int digit = 0;
        for(int i=0;i<nums.length;i++){
            e = e+nums[i];
            int temp = nums[i];
            while(temp>0){
                digit = temp%10;
                d = d+digit;
                temp = temp/10;
            }
        }
        return e-d;
    }

}

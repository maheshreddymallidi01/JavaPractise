package com.practise.ArraysPractise;

public class Practise30 {

	public static void main(String[] args) {
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;
		System.out.println(arithmeticTriplets(nums, diff));
	}

	private static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]-nums[i]==diff){
                    for(int k=0;k<nums.length;k++){
                        if(nums[k]-nums[j]==diff){
                            count++;
                        }
                    }
                }
                
            }
        }
        return count;
    }

}

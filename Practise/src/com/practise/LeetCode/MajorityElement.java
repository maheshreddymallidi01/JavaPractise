package com.practise.LeetCode;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {2,2,1,1,2,2};
		System.out.println(majorityElement(nums));
	}

	private static int majorityElement(int[] nums) {
		//Moore's Voting Algorithm
        int n = nums.length;
        int c = 0;
        int e = 0;
        for(int i=0;i<n;i++){
            if(c==0){
                c = 1;
                e = nums[i];
            }
            else if(e==nums[i]){
                c++;
            }
            else{
                c--;
            }
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(e==nums[i]){
                cnt++;
            }
        }
        if(cnt>(n/2)){
            return e;
        }
        return -1;
    }
}

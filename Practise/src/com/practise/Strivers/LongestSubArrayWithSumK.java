package com.practise.Strivers;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		int[] a = {1,2,3,1,1,1,1};
		int k = 3;
		System.out.println(longestSubarrayWithSumK(a, k));
	}
	
	private static int longestSubarrayWithSumK(int []a, long k) {
        int left = 0;
        int right = 0;
        int max = 0;
        long sum = 0;
        while(right<a.length){
        	sum += a[right];
            while(left<=right&&sum>k){
                sum -= a[left];
                left++;
            }
            if(sum==k){
                max = Math.max(max, right-left+1);
            }
            right++;
        }
        return max;
    }

}

package com.practise.SlidingWindow;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		System.out.println(maximumSumSubArray(arr,k));
	}
	
	private static int maximumSumSubArray(int[] arr,int k) {
		int n = arr.length;
		int windowSum = 0;
		
		for(int i=0;i<k;i++) {
			windowSum += arr[i];
		}
		
		int max = windowSum;
		
		for(int i=k;i<n;i++) {
			windowSum += arr[i]-arr[i-k];
			max = Math.max(max, windowSum);
		}
		
		return max;
	}

}

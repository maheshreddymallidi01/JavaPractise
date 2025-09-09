package com.practise.StacksAndQueues;

import java.util.Stack;

public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(findWaterTrapped(arr,arr.length));
		System.out.println(findWaterTrapped2(arr,arr.length));
	}

	private static int findWaterTrapped(int[] arr, int n) {
		int left = 0;
		int right = n-1;
		int maxLeft = 0;
		int maxRight = 0;
		int res = 0;
		while(left<=right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>=maxLeft) {
					maxLeft = arr[left];
				}else {
					res += maxLeft-arr[left];
				}
				left++;
			}else {
				if(arr[right]>=maxRight) {
					maxRight = arr[right];
				}else {
					res += maxRight-arr[right];
				}
				right--;
			}
		}
		return res;
	}
	
	private static int findWaterTrapped2(int[] arr, int n) { // 0,1,0,2,1,0,1,3,2,1,2,1
		int res = 0;
		Stack<Integer> stc = new Stack<>();
		for(int i=0;i<n;i++) {
			while(!stc.isEmpty()&&arr[i]>arr[stc.peek()]) {
				int bottom = stc.pop();
				
				if(stc.isEmpty()) break;
				int left = stc.peek();
				int width = i-left-1;
				int minHeight = Math.min(arr[left], arr[i]);
				
				res += width*(minHeight-arr[bottom]);
			}
			stc.push(i);
		}
		return res;
	}
}

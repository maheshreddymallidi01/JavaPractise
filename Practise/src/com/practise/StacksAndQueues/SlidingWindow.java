package com.practise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = {4,0,-1,3,5,3,6,8};
		int k = 3;
		int[] res = maximumInWindow(arr,k);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	
	private static int[] maximumInWindow(int[] arr,int k) {
		int n = arr.length;
		int[] res = new int[n-k+1];
		int r = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			if(!dq.isEmpty()&&dq.peek()==i-k) {
				dq.poll();
			}
			
			while(!dq.isEmpty()&&arr[dq.peekLast()]<arr[i]) {
				dq.pollLast();
			}
			
			dq.offer(i);
			
			if(i>=k-1) {
				res[r++] = arr[dq.peek()];
			}
		}
		return res;
	}

}

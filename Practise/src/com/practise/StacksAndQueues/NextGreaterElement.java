package com.practise.StacksAndQueues;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr = {3,10,4,2,1,2,6,1,7,2,9};
		int n = arr.length;
		int[] res = findNextGreater(arr,n);
		for(int i:res) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] res2 = findNextGreater2(arr,n);
		for(int i:res2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	private static int[] findNextGreater(int[] arr,int n) {
		int[] res = new int[n];
		Stack<Integer> stc = new Stack<>();
		for(int i=n-1;i>=0;i--) {
			while(!stc.isEmpty()&&stc.peek()<=arr[i]) {
				stc.pop();
			}
			
			if(stc.isEmpty()) {
				res[i]=-1;
			}else {
				res[i]=stc.peek();
			}
			stc.push(arr[i]);
		}
		return res;
	}

	private static int[] findNextGreater2(int[] arr,int n) {
		int[] res = new int[n];
		Stack<Integer> stc = new Stack<>();
		for(int i=2*n-1;i>=0;i--) {
			while(!stc.isEmpty()&&stc.peek()<=arr[i%n]) {
				stc.pop();
			}
			
			if(i<n) {
				if(stc.isEmpty()) {
					res[i]=-1;
				}else {
					res[i]=stc.peek();
				}
			}
			stc.push(arr[i%n]);
		}
		return res;
	}
	
}

package com.practise.Heaps;

import java.util.PriorityQueue;

public class KNearlySortedArray {

	public static void main(String[] args) {
		int[] arr = {3,2,6,5,4};
		int k = 2;
		for(int result:kNearlySortedArray(arr,k)) {
			System.out.print(result+" ");
		}
	}
	
	private static int[] kNearlySortedArray(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int index = 0;
		
		for(int i=0;i<arr.length&&i<=k;i++) {
			minHeap.add(arr[i]);
		}
		
		for(int i=k+1;i<arr.length;i++) {
			arr[index++] = minHeap.poll();
			minHeap.add(arr[i]);
		}
		
		while(!minHeap.isEmpty()) {
			arr[index++] = minHeap.poll();
		}
		
		return arr;
	}

}

package com.practise.Heaps;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr =  {9, 4, 7, 1, -2, 6, 5};
		heapSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	private static void heapSort(int[] arr) {
		int n = arr.length;
		
		for(int i=(n/2)-1;i>=0;i--) {
			heapifyDown(arr,n,i);
		}
		
		for(int i=n-1;i>0;i--) {
			swap(arr,0,i);
			heapifyDown(arr,i,0);
		}
	}
	
	private static void heapifyDown(int[] arr,int size,int index) {
		while(true) {
			int largest = index;
			int left = 2*index+1;
			int right = 2*index+2;
			
			if(left<size&&arr[left]>arr[largest]) {
				largest = left;
			}
			
			if(right<size&&arr[right]>arr[largest]) {
				largest = right;
			}
			
			if(largest==index) {
				break;
			}
			
			swap(arr,largest,index);
			index = largest;
		}
	}
	
	private static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

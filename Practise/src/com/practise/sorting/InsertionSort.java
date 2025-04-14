package com.practise.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {8,5,6,2,1};
		insertionSort(arr);
	}
	
	private static void insertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int j = i;
			while(j>0&&arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

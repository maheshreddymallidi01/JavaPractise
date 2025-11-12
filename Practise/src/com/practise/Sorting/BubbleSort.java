package com.practise.Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {8,5,6,2,1};
		bubbleSort(arr);
	}
	
	private static void bubbleSort(int[] arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

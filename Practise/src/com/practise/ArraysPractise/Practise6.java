package com.practise.ArraysPractise;

public class Practise6 {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,8,6,20,9,7};
		arrayEvenandOdd(arr);
	}

	private static void arrayEvenandOdd(int[] arr) {
		int j = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}

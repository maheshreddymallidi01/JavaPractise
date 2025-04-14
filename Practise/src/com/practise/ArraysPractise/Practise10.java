package com.practise.ArraysPractise;

public class Practise10 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int count = 0;
		int k = 3;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

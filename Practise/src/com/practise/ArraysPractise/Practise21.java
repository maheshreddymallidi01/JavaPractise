package com.practise.ArraysPractise;

public class Practise21 {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{3,2,1}};
		System.out.println(maxWealth(arr));
	}
	
	private static int maxWealth(int[][] arr) {
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum = sum+arr[i][j];
			}
			if(sum>max) {
				max = sum;
			}
		}
		return max;
	}
}

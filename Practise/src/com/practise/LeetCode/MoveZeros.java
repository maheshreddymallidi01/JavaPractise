package com.practise.LeetCode;

public class MoveZeros {

	public static void main(String[] args) {
		int[] a = {0,1,0,2,3,4,0};
		moveZero(a);
		for(int r:a) {
			System.out.print(r+" ");
		}
	}

	private static void moveZero(int[] a) {
		int j = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
	}
}

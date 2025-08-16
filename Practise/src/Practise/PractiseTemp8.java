package Practise;

import java.util.Arrays;

public class PractiseTemp8 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };
		int n = 4;
		int m = 5;
		mergeTwoSortedArrays(arr1, arr2, n, m);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}

	private static void mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m) {
		int l = n - 1;
		int r = 0;
		while (l >= 0 && r < m) {
			if (arr1[l] > arr2[r]) {
				int temp = arr1[l];
				arr1[l] = arr2[r];
				arr2[r] = temp;
				r++;
				l--;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

}

package Practise;

import java.util.HashMap;
import java.util.Map;

public class PractiseTemp4 {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 11 };
		int k = 14;
		System.out.println(twoSum(arr, k));
		System.out.println();
		int[] arr2 = { 2, 0, 2, 1, 1, 0 };
		sortArray(arr2);
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr3 = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(arr3));
		int[] arr4 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximumSubArray(arr4));
	}

	private static boolean twoSum(int[] arr, int k) {
		Map<Integer, Integer> mmr = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int rem = k - arr[i];
			if (mmr.containsKey(rem)) {
				return true;
			}
			mmr.put(arr[i], i);
		}
		return false;
	}

	private static void sortArray(int[] arr2) { // 2,0,2,1,1,0
		int low = 0;
		int mid = 0;
		int high = arr2.length - 1;
		while (mid <= high) {
			if (arr2[mid] == 0) {
				reverse(arr2, low, mid);
				low++;
				mid++;
			} else if (arr2[mid] == 1) {
				mid++;
			} else {
				reverse(arr2, mid, high);
				high--;
			}
		}
	}

	private static void reverse(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	private static int majorityElement(int[] arr3) { // 2, 2, 1, 1, 1, 2, 2
		int c = 0;
		int e = arr3[0];
		int c1 = 0;
		for (int i = 1; i < arr3.length; i++) {
			if (c == 0) {
				c = 1;
				e = arr3[i];
			} else if (e == arr3[i]) {
				c += 1;
			} else {
				c = 0;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == e) {
				c1++;
			}
		}
		if (c1 > arr3.length / 2) {
			return e;
		}
		return -1;
	}

	private static int maximumSubArray(int[] arr4) { // -2,1,-3,4,-1,2,1,-5,4
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr4.length; i++) {
			sum += arr4[i];
			if (sum < 0) {
				sum = 0;
			} else {
				max = Math.max(max, sum);
			}
		}
		return max;
	}
}
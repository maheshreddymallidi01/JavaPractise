package Practise;

import java.util.Arrays;
import java.util.Comparator;

public class PractiseTemp5 {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(stockBuyAndSell(arr));
		int[] arr2 = { 1, 2, -4, -5 };
		System.out.println();
		for (int i : rearrangeElements(arr2)) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr3 = { 10, 22, 12, 3, 0, 6 };
		for (int i : leadersInArray(arr3)) {
			System.out.print(i + " ");
		}
	}

	private static int stockBuyAndSell(int[] arr) {
		int profit = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sell = 0;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			sell = arr[i] - min;
			profit = Math.max(sell, profit);
		}
		return profit;
	}

	private static int[] rearrangeElements(int[] arr2) {
		int[] r = new int[arr2.length];
		int i = 0;
		int j = 1;
		for (int k = 0; k < arr2.length; k++) {
			if (arr2[k] < 0) {
				r[j] = arr2[k];
				j += 2;
			} else {
				r[i] = arr2[k];
				i += 2;
			}
		}
		return r;
	}

	private static int[] leadersInArray(int[] arr3) { // 10, 22, 12, 3, 0, 6
		int[] r = new int[arr3.length];
		int c = 1;
		r[0] = arr3[arr3.length - 1];
		int max = arr3[arr3.length - 1];
		for (int i = arr3.length - 2; i > 0; i--) {
			if (arr3[i] > max) {
				max = arr3[i];
				r[c] = arr3[i];
				c++;
			}
		}
		Integer[] boxedArray = Arrays.stream(r).boxed().toArray(Integer[]::new);
		// if it is List, then use Collections.sort(r, Collections.reverseOrder());
		Arrays.sort(boxedArray, Comparator.reverseOrder());
		return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
	}
}

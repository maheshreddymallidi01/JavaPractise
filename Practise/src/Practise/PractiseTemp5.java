package Practise;

public class PractiseTemp5 {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(stockBuyAndSell(arr));
		int[] arr2 = { 1, 2, -4, -5 };
		System.out.println();
		for (int i : rearrangeElements(arr2)) {
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
}

package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PractiseTemp7 {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(arr));
		int[] arr2 = { 1, 0, -1, 0, -2, 2 };
		System.out.println(fourSum(arr2));
	}

	private static List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> r = new ArrayList<>();
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			} else {
				int j = i + 1;
				int k = n - 1;
				while (j < k) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum < 0) {
						j++;
					} else if (sum > 0) {
						k--;
					} else {
						List<Integer> s = Arrays.asList(arr[i], arr[j], arr[k]);
						r.add(s);
						j++;
						k--;
						while (j < k && arr[j] == arr[j - 1]) {
							j++;
						}
						while (j < k && arr[k] == arr[k + 1]) {
							k--;
						}
					}
				}
			}
		}
		return r;
	}

	private static List<List<Integer>> fourSum(int[] arr) {
		List<List<Integer>> r = new ArrayList<>();
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (j != i + 1 && arr[j] == arr[j - 1])
					continue;
				int k = j + 1;
				int l = n - 1;
				while (k < l) {
					int sum = arr[i] + arr[j] + arr[k] + arr[l];
					if (sum < 0) {
						k++;
					} else if (sum > 0) {
						l--;
					} else {
						List<Integer> s = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
						r.add(s);
						k++;
						l--;
						while (k < l && arr[k] == arr[k - 1]) {
							k++;
						}
						while (k < l && arr[l] == arr[l + 1]) {
							l--;
						}
					}
				}
			}
		}
		return r;
	}
}

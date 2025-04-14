package Practise;

import java.util.Arrays;
import java.util.List;

public class PractiseTemp2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3, 0, 4, 0 };
		moveZerosToEnd(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		List<String> mmr = Arrays.asList("ab", "aba", "xoy", "pop", "mmr");
		mmr.stream().filter(i -> i.length() > 0 && i.endsWith(String.valueOf(i.charAt(0))))
				.forEach(System.out::println);
	}

	private static void moveZerosToEnd(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
}

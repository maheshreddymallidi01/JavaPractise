package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class PractiseTemp {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 6, 9, 2 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(findLargest(arr));
		System.out.println(findSecondLargest(arr));
		System.out.println(findSecondSmallest(arr));
		System.out.println(checkSorted(arr2));
		Scanner scan = new Scanner(System.in);
		/*
		 * String sentence = scan.nextLine(); String str1 = scan.next(); String str2 =
		 * scan.next(); System.out.println(distanceOfWords(sentence,str1,str2));
		 */
		int[] arr3 = { 1, 2, 2, 3, 3, 3 };
		for (int i : removeDuplicates(arr3)) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr4 = { 1, 2, 3, 4, 5 };
		rotateByOne(arr4);
		for (int i : arr4) {
			System.out.print(i + " ");
		}
		int[] arr5 = { 6, 7, 8, 9, 10 };
		int d = 3;
		System.out.println();
		int[] r = rotateByDPlaces(arr5, d);
		for (int i : r) {
			System.out.print(i + " ");
		}
	}

	private static int findLargest(int[] arr) {
		return Arrays.stream(arr).boxed().max(Integer::compareTo).get();
	}

	private static int findSecondLargest(int[] arr) {
		return Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}
	
	private static int findSecondSmallest(int[] arr) {
		return Arrays.stream(arr).boxed().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
	}

	private static int distanceOfWords(String sentence, String str1, String str2) {
		String[] str = sentence.split(" ");
		int r1 = 0;
		int r2 = 0;
		for (int i = 0; i < str.length; i++) {
			if (str1.equals(str[i])) {
				r1 = i;
			} else if (str2.equals(str[i])) {
				r2 = i;
			}
		}
		return r2 - r1 - 1;
	}

	private static boolean checkSorted(int[] arr) {
		return IntStream.range(0, arr.length - 1).allMatch(i -> arr[i] <= arr[i + 1]);
	}

	private static int[] removeDuplicates(int[] arr) { // 1 2 2 3 3 3
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return Arrays.copyOf(arr, i + 1);
	}

	private static void rotateByOne(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}

	private static int[] rotateByDPlaces(int[] arr, int d) {
		if (d > arr.length) {
			d = d % arr.length;
		}
		/*
		 * reverse(0, d - 1, arr); reverse(d, arr.length - 1, arr); reverse(0,
		 * arr.length - 1, arr);
		 */
		int[] r = IntStream.concat(IntStream.of(Arrays.copyOfRange(arr, d, arr.length)),
				IntStream.of(Arrays.copyOfRange(arr, 0, d))).toArray();
		return r;

	}

	private static void reverse(int l, int h, int[] arr) {
		while (l < h) {
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
	}
}

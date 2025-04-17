package Practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

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
		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(IntStream.range(0, arr2.length).filter(i -> arr2[i] == 3).findFirst().orElse(-1));
		System.out.println();
		int[] arr3 = { 2, 3, 4, 4, 5 };
		for (int r : findUnion(arr2, arr3)) {
			System.out.print(r + " ");
		}
		System.out.println();
		int[] arr4 = {1,0,1,1,0,1};
		System.out.println(maximumOnes(arr4));
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

	private static int[] findUnion(int[] arr2, int[] arr3) {
		int[] r = null;
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
		}
		for (int i = 0; i < arr3.length; i++) {
			s.add(arr3[i]);
		}
		r = s.stream().mapToInt(i -> Integer.valueOf(i)).toArray();
		return r;
	}
	
	private static int maximumOnes(int[] arr4) { //  1,0,1,1,0,1
		int count=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr4.length;i++) {
			if(arr4[i]==1) {
				count+=1;
			}else {
				count=0;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}

package com.practise.LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PractiseMMR {

	public static void main(String[] args) {
		int[] arr = {1,2,3,100,5,2,3};
		for(int r:largest(arr)) {
			System.out.print(r+" ");
		}
	}

	private static int[] largest(int[] arr) {
		Set<Integer> mmr = new HashSet<>();
		return Arrays.stream(arr).boxed().toList().stream().filter(x->mmr.add(x)).toList().stream().mapToInt(Integer::intValue).toArray();
	}
}

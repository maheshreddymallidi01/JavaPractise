package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practise25 {

	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		int[] result = smallerThanCurrent(nums);
		for(int r:result) {
			System.out.println(r);
		}
	}

	private static int[] smallerThanCurrent(int[] nums) {
		List<Integer> r = Arrays.stream(nums).map(x->(int)Arrays.stream(nums).filter(y->x>y).count()).boxed().collect(Collectors.toList());
		return r.stream().mapToInt(Integer::intValue).toArray();
	}
}

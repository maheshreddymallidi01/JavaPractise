package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.List;

public class Practise18 {

	public static void main(String[] args) {
		int[] nums = {2,5,6,3,7,9};
		int n = 3;
		int [] result = shuffle(nums,n);
		for(int m:result) {
			System.out.println(m);
		}
	}

	private static int[] shuffle(int[] nums, int n) {
		List<Integer> r = new ArrayList<>();
		int temp = n;
		for(int i=0;i<n;i++) {
			r.add(nums[i]);
			r.add(nums[temp]);
			temp++;
		}
		return r.stream().mapToInt(Integer::intValue).toArray();
	}

}

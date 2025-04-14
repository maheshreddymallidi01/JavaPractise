package com.practise.LeetCode;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 3 };
		for (int i : removeDuplicates(nums)) {
			System.out.print(i + " ");
		}
	}

	private static int[] removeDuplicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				nums[i + 1] = nums[j];
				i++;
			}
		}
		return Arrays.copyOf(nums, i + 1);
	}
}

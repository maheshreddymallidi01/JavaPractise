package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.List;

public class Practise27 {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4}; 
		int[] index = {0,1,2,2,1};
		int[] target = createTargetArray(nums,index);
		for(int t:target) {
			System.out.println(t);
		}
	}

	private static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> r = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			r.add(index[i],nums[i]);
		}
		return r.stream().mapToInt(Integer::intValue).toArray();
	}

}

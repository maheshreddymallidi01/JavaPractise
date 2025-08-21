package com.practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionPractise5 {

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target = 7;
		List<List<Integer>> res = combinationSum(arr,target);
		System.out.println(res);
	}
	
	private static List<List<Integer>> combinationSum(int[] arr,int target){
		List<Integer> ds = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		findCombination(0,target,ds,res,arr);
		return res;
	}
	
	private static void findCombination(int ind,int target, List<Integer> ds,List<List<Integer>> res, int[] arr) {
		if(ind==arr.length) {
			if(target==0) {
				res.add(new ArrayList<>(ds));
			}
			return;
		}
		if(arr[ind]<=target) {
			ds.add(arr[ind]);
			findCombination(ind, target-arr[ind], ds, res, arr);
			ds.remove(ds.size()-1);
		}
		findCombination(ind+1, target, ds, res, arr);
	}
}

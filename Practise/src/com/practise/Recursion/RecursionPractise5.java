package com.practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionPractise5 {

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int target = 7;
		List<List<Integer>> res = combinationSum(arr,target);
		System.out.println(res);
		
		int[] arr2 = {10,1,2,7,6,1,5};
		int target2 = 8;
		List<List<Integer>> res2 = combinationSum2(arr2,target2);
		System.out.println(res2);
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
	
	private static List<List<Integer>> combinationSum2(int[] arr,int target){
		List<Integer> ds = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
		findCombination2(0,target,ds,res,arr);
		return res;
	}
	
	private static void findCombination2(int ind,int target, List<Integer> ds,List<List<Integer>> res, int[] arr) {
		if(target==0) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=ind;i<arr.length;i++) {
			if(i>ind&&arr[i]==arr[i-1]) continue;
			if(arr[i]>target) break;
			
			ds.add(arr[i]);
			findCombination2(i+1, target-arr[i], ds, res, arr);
			ds.remove(ds.size()-1);
		}
	}
}

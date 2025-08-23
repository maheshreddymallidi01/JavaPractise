package com.practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecursionPractise6 {

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = 3;
		List<Integer> res = findSubSetSum(arr,n);
		System.out.println(res);
		
		int[] arr2 = {1,2,2};
		List<List<Integer>> res2 = findSubSetSum2(arr2,arr2.length);
		System.out.println(res2);
	}
	
	private static List<List<Integer>> findSubSetSum2(int[] arr,int n){
		Arrays.sort(arr);
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		findSubSet2(0,arr,ds,res,n);
		return res;
	}
	
	private static void findSubSet2(int ind,int[] arr,List<Integer> ds, List<List<Integer>> res,int n) {
		res.add(new ArrayList<>(ds));
		for(int i=ind;i<n;i++) {
			if(i!=ind&&arr[i]==arr[i-1]) continue;
			ds.add(arr[i]);
			findSubSet2(i+1, arr, ds, res, n);
			ds.remove(ds.size()-1);
		}
	}
	
	private static List<Integer> findSubSetSum(int[] arr,int n){
		List<Integer> ds = new ArrayList<>();
		int sum = 0;
		findSubSet(0,sum,arr,ds,n);
		Collections.sort(ds);
		return ds;
	}
	
	private static void findSubSet(int ind,int sum,int[] arr,List<Integer> ds,int n) {
		if(ind==n) {
			ds.add(sum);
			return;
		}
		findSubSet(ind+1,sum+arr[ind],arr,ds,n);
		findSubSet(ind+1,sum,arr,ds,n);
	}

}

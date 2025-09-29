package com.practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionPractise4 {

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		List<Integer> mmr = new ArrayList<>();
		printSS(0,mmr,arr,n);
		System.out.println("---------------------------");
		int sum = 3;
		printSSWhenSum(0,mmr,0,sum,arr,n);
		System.out.println("---------------------------");
		printSSWhenSum2(0,mmr,0,sum,arr,n);
	}
	
	private static boolean printSSWhenSum2(int ind,List<Integer> mmr,int s,int sum, int[] arr,int n) {
		if(ind==n) {
			if(s==sum) {
				for(int it:mmr) {
					System.out.print(it+" ");
				}
				System.out.println();
				return true;
			}else {
				return false;
			}
		}
		s+=arr[ind];
		mmr.add(arr[ind]);
		if(printSSWhenSum2(ind+1,mmr,s,sum,arr,n)) return true;
		s-=arr[ind];
		mmr.remove(mmr.size()-1);
		if(printSSWhenSum2(ind+1,mmr,s,sum,arr,n)) return true;
		return false;
	}
	
	private static void printSSWhenSum(int ind,List<Integer> mmr,int s,int sum, int[] arr,int n) {
		if(ind==n) {
			if(s==sum) {
				for(int it:mmr) {
					System.out.print(it+" ");
				}
			}
			System.out.println();
			return;
		}
		s+=arr[ind];
		mmr.add(arr[ind]);
		printSSWhenSum(ind+1,mmr,s,sum,arr,n);
		s-=arr[ind];
		mmr.remove(mmr.size()-1);
		printSSWhenSum(ind+1,mmr,s,sum,arr,n);
	}
	
	public static void printSS(int ind,List<Integer> mmr,int[] arr,int n) {
		if(ind==n) {
			if(mmr.size()==0) {
				System.out.println("{}");
			}else {
				for(int it:mmr) {
					System.out.print(it+" ");
				}
			}
			System.out.println();
			return;
		}
		printSS(ind+1,mmr,arr,n);
		
		mmr.add(arr[ind]);
		printSS(ind+1,mmr,arr,n);
		mmr.remove(mmr.size()-1);
	}
}

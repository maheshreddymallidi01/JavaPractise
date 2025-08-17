package com.practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionPractise4 {

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		List<Integer> mmr = new ArrayList<>();
		printSS(0,mmr,arr,n);
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

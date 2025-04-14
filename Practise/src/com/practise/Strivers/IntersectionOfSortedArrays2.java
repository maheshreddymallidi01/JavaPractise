package com.practise.Strivers;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfSortedArrays2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,2,2,3,4));
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2,2,3,3));
		int n = arr1.size();
		int m = arr2.size();
		ArrayList<Integer> intersectionOfArrays = findArrayIntersection(arr1,n,arr2,m);
		for(Integer r:intersectionOfArrays) {
			System.out.print(r+" ");
		}
	}

	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> out = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<n&&j<m) {
			if(arr1.get(i)<arr2.get(j)){
				i++;
			}
			else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				out.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return out;
	}
}

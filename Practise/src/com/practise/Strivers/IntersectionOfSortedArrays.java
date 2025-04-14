package com.practise.Strivers;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		int[] a = {1,2,2,3,4,5};
		int[] b = {2,3,5,5,6};
		List<Integer> intersectionOfArrays = sortedArrays(a,b);
		for(Integer r:intersectionOfArrays) {
			System.out.print(r+" ");
		}
	}

	private static List<Integer> sortedArrays(int[] a, int[] b) {
		List<Integer> out = new ArrayList<>();
		int i = 0;
		int j = 0;
		while(i<a.length&&j<b.length) {
			if(a[i]!=b[j]) {
				if(a[i]<b[j]) {
					i++;
				}
				else {
					j++;
				}
			}
			if(a[i]==b[j]) {
				if(out.size()==0 || out.get(out.size()-1)!=a[i]) {
					out.add(a[i]);
					i++;
					j++;
				}
			}
		}
		return out;
	}

}

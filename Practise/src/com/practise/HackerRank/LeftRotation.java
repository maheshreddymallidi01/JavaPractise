package com.practise.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int d = 4;
		List<Integer> a = Arrays.stream(arr).boxed().toList();
		System.out.println(rotLeft(a,d));
	}
	
	private static List<Integer> rotLeft(List<Integer> a, int d) {
	        List<Integer> r = new ArrayList<>();
	        r.addAll(a);
	        while(d>=1){
	            r.add(r.get(0));
	            r.remove(0);
	            d--;            
	        }
	        return r;
	    }

}

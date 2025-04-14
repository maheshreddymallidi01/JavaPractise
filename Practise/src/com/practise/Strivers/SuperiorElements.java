package com.practise.Strivers;

import java.util.ArrayList;
import java.util.List;

public class SuperiorElements {

	public static void main(String[] args) {
		int[] a = {1,2,3,2};
		for(int r:superiorElements(a)) {
			System.out.print(r+" ");
		}
	}
	
	private static List< Integer > superiorElements(int []a) {
        // Write your code here.
        List<Integer> r = new ArrayList<>();
        int max = a[a.length-1];
        r.add(max);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>max){
                max = a[i];
                r.add(max);
            }
        }
        return r;
    }

}

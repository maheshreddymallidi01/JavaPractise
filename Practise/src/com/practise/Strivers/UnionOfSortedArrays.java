package com.practise.Strivers;

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {2,3,5,6};
		List<Integer> unionOfArrays = sortedArray(a, b);
		for(Integer r:unionOfArrays) {
			System.out.print(r+" ");
		}
	}
	
	private static List<Integer> sortedArray(int []a, int []b) {
        List<Integer> out = new ArrayList<>();
        int left = 0;
        int right = 0;
        while(left<a.length&&right<b.length){
            if(a[left]<=b[right]){
                if(out.size()==0 || (out.get(out.size()-1)!=a[left])){
                    out.add(a[left]);
                }
                left++;
            }
            else{
                if(out.size()==0 || (out.get(out.size()-1)!=b[right])){
                    out.add(b[right]);
                }
                right++;
            }
        }
        while(left<a.length){
            if(out.size()==0 || (out.get(out.size()-1)!=a[left])){
                    out.add(a[left]);
                }
                left++;
        }
        while(right<b.length){
            if(out.size()==0 || (out.get(out.size()-1)!=b[right])){
                    out.add(b[right]);
                }
                right++;
        }
        return out;
    }

}

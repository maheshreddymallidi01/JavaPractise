package com.practise.Strivers;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithXORK {
	public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int b = 6;
        int ans = subarraysWithXorK(a, b);
        System.out.println("The number of subarrays with XOR b is: " + ans);
    }
	
	public static int subarraysWithXorK(int []a, int b) {
        // Write your code here
        int xr = 0;
        int count = 0;
        Map<Integer,Integer> mr = new HashMap<>();
        mr.put(xr, 1);
        for(int i=0;i<a.length;i++){
            xr = xr^a[i];
            int x = xr^b;
            if(mr.containsKey(x)){
                count += mr.get(x);
            }
            if(mr.containsKey(xr)){
                mr.put(xr, mr.get(xr)+1);
            }else{
                mr.put(xr, 1);
            }
        }
        return count;
    }
}

package com.practise.Strivers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK3 {

	public static void main(String[] args) {
		int[] a = {-1,0,1,1,-1,-1,0};
		System.out.println(getLongestZeroSumSubarrayLength(a));
	}
	
	public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int sum = 0;
        int max = 0;
        Map<Integer,Integer> mr = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum==0){
                max = Math.max(max, i+1);
            }else{
                if(mr.containsKey(sum)){
                    int len = i-mr.get(sum);
                    max = Math.max(max,len);
                }
                else{
                    mr.put(sum,i);
                }
            }
        }
        return max;
    }
}

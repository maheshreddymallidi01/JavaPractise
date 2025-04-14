package com.practise.Strivers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAllOverlappingIntervals {

	public static void main(String[] args) {
		int[][] arr = {{1,3},{2,4},{3,5},{6,7}};
		System.out.println(mergeOverlappingIntervals(arr));
	}

	public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        // Write your code here.
		int n = arr.length;
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
		for(int i=0;i<n;i++) {
			if(result.isEmpty()||arr[i][0]>result.get(result.size()-1).get(1)) {
				result.add(Arrays.asList(arr[i][0],arr[i][1]));
			}else {
				result.get(result.size()-1).set(1, Math.max(result.get(result.size()-1).get(1), arr[i][1]));
			}
		}
		return result;
    }
}

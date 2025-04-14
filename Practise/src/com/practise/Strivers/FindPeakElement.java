package com.practise.Strivers;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPeakElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,5,1));
		System.out.println(findPeakElement(arr));
	}

	public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size();
        int ans = -1;
        if(n==1){
            return 0; 
        }
        if(arr.get(0)>arr.get(1)){
            ans = 0;
        }
        if(arr.get(n-1)>arr.get(n-2)){
            ans = n-1;
        }
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid-1)<arr.get(mid)&&arr.get(mid)>arr.get(mid+1)){
                ans = mid;
            }
            if(arr.get(mid-1)<arr.get(mid)||arr.get(mid)<arr.get(mid+1)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}

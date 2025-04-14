package com.practise.Strivers;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurance {

	public static void main(String[] args){
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,2,2,2,5,6,8,8));
		int n = arr.size();
		int k = 8;
		for(int r:firstAndLastPosition(arr, n, k)) {
			System.out.print(r+" ");
		}
	}
	public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int lb = lowerBound(arr, n, k);
        if(lb==n||arr.get(lb)!=k){
            return new int[]{-1,-1};
        }
        return new int[]{lb,upperBound(arr, n, k)-1};
    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static int upperBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

}

package com.practise.Strivers;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int n = 5;
		int target = 5;
		int[] book = {4,1,2,3,1};
		System.out.println(read(n, book, target));
	}

	private static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = book[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(book[i], i);
        }
        return "NO";
    }
}

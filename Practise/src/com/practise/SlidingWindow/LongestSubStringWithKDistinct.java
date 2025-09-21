package com.practise.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKDistinct {

	public static void main(String[] args) {
		String str = "cadbzabcd";
		System.out.println(longestSubString(str));
	}

	private static int longestSubString(String str) {
		int l = 0;
		int r = 0;
		int maxLen = 0;
		int n = str.length();
		Map<Character, Integer> mpp = new HashMap<>();
		
		while(r<n) {
			char c = str.charAt(r);
			if(mpp.containsKey(c)) {
				l = Math.max(mpp.get(c)+1,l);
			}
			
			mpp.put(c, r);
			maxLen=Math.max(maxLen, r-l+1);
			r++;
		}
		return maxLen;
	}
}

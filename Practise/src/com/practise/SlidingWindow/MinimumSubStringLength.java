package com.practise.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubStringLength {

	public static void main(String[] args) {
		String str = "ddaaabbca";
		String target = "abc";
		System.out.println(minimumSubStringLength(str,target));
	}
	
	private static int minimumSubStringLength(String str,String target) {
		if(str.length()<target.length()) {
			return 0;
		}
		int minLen = Integer.MAX_VALUE;
		Map<Character, Integer> mpp = new HashMap<>();
		int left = 0;
		int right = 0;
		int cnt = target.length();
		
		for(char ch:target.toCharArray()) {
			mpp.put(ch, mpp.getOrDefault(ch,0)+1);
		}
		
		while(right<str.length()) {
			char ch = str.charAt(right);
			if(mpp.containsKey(ch)) {
				if(mpp.get(ch)>0) {
					cnt--;
				}
				mpp.put(ch, mpp.get(ch)-1);
			}
			right++;
			
			while(cnt==0) {
				minLen = Math.min(minLen, right-left);
				
				char lc = str.charAt(left);
				if(mpp.containsKey(lc)) {
					mpp.put(lc, mpp.get(lc)+1);
					if(mpp.get(lc)>0) {
						cnt++;
					}
				}
				left++;
			}
		}
		
		return minLen==Integer.MAX_VALUE?0:minLen;
	}

}

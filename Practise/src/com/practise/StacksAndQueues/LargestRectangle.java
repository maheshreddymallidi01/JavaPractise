package com.practise.StacksAndQueues;

import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangle(heights));
	}

	private static int largestRectangle(int[] heights) {
		int res = 0;
		int n = heights.length;
		Stack<Integer> stc = new Stack<>();
		for(int i=0;i<=n;i++) {
			while(!stc.isEmpty()&&(i==n||heights[stc.peek()]>=heights[i])) {
				int height = heights[stc.peek()];
				
				stc.pop();
				
				int width;
				
				if(stc.isEmpty()) {
					width = i;
				}else {
					width = i-stc.peek()-1;
				}
				res = Math.max(res, height*width);
			}
			stc.push(i);
		}
		return res;
	}
}

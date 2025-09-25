package Practise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SQPractise {

	public static void main(String[] args) {
		String str = "{[()]}";
		if(isValid(str)) {
			System.out.println("Is Valid");
		}else {
			System.out.println("Is Not Valid");
		}
		
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappedWater(arr));
		System.out.println(trappedWater2(arr));
		
		String removeK = "1432219";
		int k = 3;
		System.out.println(removeK(removeK,k));
		
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangle(heights));
	}
	
	private static int largestRectangle(int[] heights) {
		int res = 0;
		int n = heights.length;
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i=0;i<n;i++) {
			while(!dq.isEmpty()&&heights[dq.peekLast()]>heights[i]) {
				int height = heights[dq.pollLast()];
				
				int width = dq.isEmpty()?i:i-dq.peekLast()-1;
				res = Math.max(res, width*height);
			}
			dq.offer(i);
		}
		
		while(!dq.isEmpty()) {
			int height = heights[dq.pollLast()];
			
			int width = dq.isEmpty()?n:n-dq.peekLast()-1;
			res = Math.max(res,width*height);
		}
		return res;
	}
	
	private static String removeK(String str, int k) {
		if(k>=str.length()) {
			return "0";
		}
		
		Deque<Character> dq = new ArrayDeque<>();
		for(char ch:str.toCharArray()) {
			while(k>0&&!dq.isEmpty()&&ch<dq.peekLast()){
				dq.pollLast();
				k--;
			}
			
			if(!dq.isEmpty()||ch!='0') {
				dq.addLast(ch);
			}
		}
		
		while(k>0&&!dq.isEmpty()) {
			dq.pollLast();
			k--;
		}
		
		if(dq.isEmpty()) {
			return "0";
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch:dq) {
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	private static int trappedWater2(int[] arr) {
		Stack<Integer> stc = new Stack<>();
		int res = 0;
		
		for(int i=0;i<arr.length;i++) {
			while(!stc.isEmpty()&&arr[stc.peek()]<arr[i]) {
				int bottom = stc.pop();
				
				if(stc.isEmpty()) break;
				
				int leftHeight = stc.peek();
				int width = i-leftHeight-1;
				int height = Math.min(arr[i], arr[leftHeight])-arr[bottom];
				res += height*width;
			}
			stc.push(i);
		}
		return res;
	}
	
	private static int trappedWater(int[] arr) {
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int len = 0;
		int maxLeft = 0;
		int maxRight = 0;
		while(left<right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>=maxLeft) {
					maxLeft = arr[left];
				}else {
					len += maxLeft-arr[left];
				}
				left++;
			}else {
				if(arr[right]>=maxRight) {
					maxRight = arr[right];
				}else {
					len += maxRight-arr[right];
				}
				right--;
			}
		}
		return len;
	}
	
	private static boolean isValid(String str) {
		char[] arr = new char[str.length()];
		int top = -1;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') {
				arr[++top] = ch;
			}else {
				if(top==-1) return false;
				char open = arr[top--];
				if((open=='{'&&ch!='}')||
						(open=='['&&ch!=']')||
						(open=='('&&ch!=')')) {
					return false;
				}
			}
		}
		return top==-1;
	}

}

package com.practise.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

	public static void main(String[] args) {
		String str = "1432219";
		int k = 3;
		System.out.println(afterRemoving(str,k));
		System.out.println(afterRemoving2(str,k));
	}
	
	private static String afterRemoving(String str, int k) {
	    if (k >= str.length()) {
	        return "0";
	    }

	    Deque<Character> stc = new ArrayDeque<>();
	    for (char ch : str.toCharArray()) {
	        while (k > 0 && !stc.isEmpty() && ch < stc.peekLast()) {
	            stc.removeLast();
	            k--;
	        }
	        if (!stc.isEmpty() || ch != '0') {
	            stc.addLast(ch);
	        }
	    }

	    while (k > 0 && !stc.isEmpty()) {
	        stc.removeLast();
	        k--;
	    }

	    if (stc.isEmpty()) {
	        return "0";
	    }

	    StringBuilder sb = new StringBuilder();
	    for (char ch : stc) {
	        sb.append(ch);
	    }

	    return sb.toString();
	}

	private static String afterRemoving2(String str, int k) {
	    int n = str.length();
	    if (k >= n) return "0";

	    char[] arr = str.toCharArray();
	    int top = -1; // stack pointer

	    for (int i = 0; i < n; i++) {
	        char ch = arr[i];
	        while (k > 0 && top >= 0 && arr[top] > ch) {
	            top--; // pop
	            k--;
	        }
	        // Avoid leading zeros
	        if (top >= 0 || ch != '0') {
	            arr[++top] = ch; // push
	        }
	    }

	    // If still need to remove digits
	    top = Math.max(-1, top - k);

	    if (top == -1) return "0";

	    return new String(arr, 0, top + 1);
	}


}

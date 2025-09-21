package com.practise.StacksAndQueues;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s ="{[()]}";
		System.out.println(isValid(s));
		System.out.println(isValid2(s));
	}
	
	private static boolean isValid(String s) {
		Stack<Character> stc = new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch=='(') {
				stc.push(')');
			}else if(ch=='{') {
				stc.push('}');
			}else if(ch=='[') {
				stc.push(']');
			}else if(stc.isEmpty()||stc.pop()!=ch) {
				return false;
			}
		}
		if(!stc.isEmpty()) {
			return false;
		}
		return true;
	}

	private static boolean isValid2(String s) {
		int n = s.length();
	    char[] arr = new char[n]; // removed str.toCharArray() so SC is O(1) now
	    int top = -1; // acts like stack pointer

	    for (int i=0;i<n;i++) {
	    	char ch = s.charAt(i);
	        if (ch == '(' || ch == '{' || ch == '[') {
	            arr[++top] = ch; // push opening
	        } else {
	            if (top == -1) return false; // stack empty but found closing
	            char open = arr[top--];      // pop
	            if ((open == '(' && ch != ')') ||
	                (open == '{' && ch != '}') ||
	                (open == '[' && ch != ']')) {
	                return false;
	            }
	        }
	    }
	    return top == -1; // all brackets matched
	}

	
}

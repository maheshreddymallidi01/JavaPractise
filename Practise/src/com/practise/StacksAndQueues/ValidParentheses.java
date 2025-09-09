package com.practise.StacksAndQueues;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s ="{[()]}";
		System.out.println(isValid(s));
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

}

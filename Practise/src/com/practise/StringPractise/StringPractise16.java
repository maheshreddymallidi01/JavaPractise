package com.practise.StringPractise;

import java.util.Stack;

public class StringPractise16 {

	public static void main(String[] args) {
		String s ="{[()]}";
		System.out.println(isValid(s));
	}
	private static boolean isValid(String s) {
		Stack<Character> stc = new Stack<Character>();
		for(char ch:s.toCharArray()) {
			if(ch=='(') {
				stc.push(')');
			}else if(ch=='[') {
				stc.push(']');
			}else if(ch=='{') {
				stc.push('}');
			}else if(stc.empty()||stc.pop()!=ch) {
				return false;
			}
		}
		if(!stc.empty()){
			return false;
		}
		return true;
	}
}

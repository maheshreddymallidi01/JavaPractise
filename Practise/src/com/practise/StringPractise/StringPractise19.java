package com.practise.StringPractise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPractise19 {

	public static void main(String[] args) {
		String str = "mahesh";
		List<Character> ch = str.chars().mapToObj(c->(char)c).toList();
		Set<Character> s = new HashSet<>();
		ch.stream().filter(x->!s.add(x)).forEach(System.out::println);
	}

}

package com.practise.StringPractise;

import java.util.Arrays;
import java.util.List;

public class StringPractise5 {

	public static void main(String[] args) {
		List<String> mmr = Arrays.asList("ab","aba","xoy","pop","mmr");
		mmr.stream().filter(i->i.length()>0&&i.endsWith(String.valueOf(i.charAt(0)))).forEach(System.out::println);
	}

}

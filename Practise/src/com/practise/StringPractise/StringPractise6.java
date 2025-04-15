package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPractise6 {

	public static void main(String[] args) {
		String str = "Myself Mahesh and I am a Full Stack Developer";
		List<String> strA = new ArrayList<>(Arrays.asList(str.split(" ")));
		Collections.reverse(strA);
		System.out.println(String.join(" ", strA));

		StringBuilder strB = new StringBuilder(str);
		strB.reverse();
		System.out.println(strB);
	}

}

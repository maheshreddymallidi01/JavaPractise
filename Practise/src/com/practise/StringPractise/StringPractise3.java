package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPractise3 {

	public static void main(String[] args) {
		String str = "Myself Mahesh Myself Mahesh";
		int mid = str.length() / 2;
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i >= mid) {
				result = result + Character.toUpperCase(str.charAt(i));
			} else {
				result = result + Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(result);
		String result2 = IntStream.range(0, str.length())
				.mapToObj(i -> i >= mid ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i)))
				.map(String::valueOf).collect(Collectors.joining());

		System.out.println(result2);

		Stream<String> firstHalf = IntStream.range(0, mid)
				.mapToObj(i -> String.valueOf(Character.toLowerCase(str.charAt(i))));

		Stream<String> secondHalf = IntStream.range(mid, str.length())
				.mapToObj(i -> String.valueOf(Character.toUpperCase(str.charAt(i))));

		String result3 = Stream.concat(firstHalf, secondHalf).collect(Collectors.joining());

		System.out.println(result3);
	}

}

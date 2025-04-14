package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practise28 {

	public static void main(String[] args) {
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bc"};
		System.out.println(arrayStringsAreEqual(word1,word2));
	}

	private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		List<String> w1 = Arrays.asList(word1);
		List<String> w2 = Arrays.asList(word2);
		String r1 = w1.stream().collect(Collectors.joining());
		String r2 = w2.stream().collect(Collectors.joining());
		if(!r1.equals(r2)) {
			return false;
		}
		return true;
	}

}

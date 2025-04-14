package com.practise.ArraysPractise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Practise9 {

	public static void main(String[] args) {
		List<String> mmr = Arrays.asList("usa","India","France","Australia");
		String result = mmr.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(result);
	}

}

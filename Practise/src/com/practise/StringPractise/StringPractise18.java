package com.practise.StringPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPractise18 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA","BB","AA","CC","DD","EE","DD");
		Map<String,Long> result = names.stream().filter(word->Collections.frequency(names, word)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
	}

}

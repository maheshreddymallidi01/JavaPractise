package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise7 {

	public static void main(String[] args) {
		List<Integer> mmr = Arrays.asList(0,1,1,1,0,0,1,0,1,0,1);
		Integer result = mmr.stream().reduce(0, (a,b)->a+b);
		System.out.println("Number of One's "+result);
		System.out.println("Number of Zero's "+(mmr.size()-result));
		Map<Integer,Long> r = mmr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(r);
	}

}

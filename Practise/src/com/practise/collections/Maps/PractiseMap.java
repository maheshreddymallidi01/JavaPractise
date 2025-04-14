package com.practise.collections.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PractiseMap {

	public static void main(String[] args) {
		/*
		 * String[] arr =
		 * {"mahesh","reddy","mallidi","mahesh","devi","devi","bhaskar","reddy"};
		 * Map<String,Integer> out = new HashMap<>();
		 * 
		 * for(int i=0;i<arr.length;i++) { int count = 1; if(!out.containsKey(arr[i])) {
		 * out.put(arr[i], count); }else { count = out.get(arr[i])+1;
		 * out.put(arr[i],count); } }
		 * 
		 * System.out.println(out);
		 */
		List<String> out = new ArrayList<>(Arrays.asList("mahesh","reddy","mallidi","mahesh","devi","devi","bhaskar","reddy"));
		Map<String, Integer> output = out.stream()
				.collect(Collectors.toMap(Function.identity(), c -> 1,Math::addExact));
		Map<String,Long> result = out.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(output);
		System.out.println(result);
	}

}

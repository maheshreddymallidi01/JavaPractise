package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise12 {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {6,7,8,9,10};
		List<Integer> n1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> n2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
		n1.addAll(n2);
		System.out.println(n1);
		Stream<Integer> fullList = Stream.concat(n1.stream(), n2.stream());
		List<Integer> r = fullList.collect(Collectors.toList());
		System.out.println(r);
		
		List<Integer> m1 = Arrays.stream(a1).boxed().toList();
		List<Integer> m2 = Arrays.stream(a2).boxed().toList();
		Object[] out = Stream.of(m1,m2).flatMap(Stream::of).toArray();
		System.out.println(Arrays.toString(out));
		
		Integer min = r.stream().min((x,y)->x-y).get();
		Integer max = r.stream().max((x,y)->x-y).get();
		System.out.println(min);
		System.out.println(max);
	}

}

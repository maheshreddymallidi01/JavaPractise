package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practise3 {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(2,5,8,8,10,20,20,30,40,30);
		Set<Integer> m = new HashSet<>();
		
		n.stream().filter(i->!m.add(i)).forEach(System.out::println);
		
	}

}

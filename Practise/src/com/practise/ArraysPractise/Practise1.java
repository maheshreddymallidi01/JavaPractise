package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Practise1 {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(10,20,25,30,25,27,27,40);
		
 		n.stream().filter(i->i%2==0).forEach(System.out::println);
		
		n.stream().map(i->i+"").filter(j->j.startsWith("1")).forEach(System.out::println);
		
		n.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		IntStream.iterate(121, i->i/10).limit(3).forEach(System.out::println);
	}

}

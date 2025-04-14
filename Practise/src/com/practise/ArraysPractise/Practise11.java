package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Practise11 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,4,5,6,9,20,10);
		List<Double> result = num.stream().map(i->Math.sqrt(i)).collect(Collectors.toList());
		System.out.println(result);
		num.stream().map(n->n*n).filter(m->m>=100).forEach(System.out::println);
		OptionalDouble opt = num.stream().mapToInt(n->n*n).filter(m->m>=100).average();
		System.out.println(opt.getAsDouble());
	}

}

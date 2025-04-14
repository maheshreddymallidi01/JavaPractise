package com.practise.FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateApp {

	public static void main(String[] args) {
		Predicate<String> stringLength = name->name.length()>5;
		
		Predicate<String> stringContain = n -> n.contains("Welcome");
		
		boolean lengthofName = stringLength.test("Welcome");
		boolean containsName = stringContain.test("Welcome");
		
		System.out.println(lengthofName);
		System.out.println(containsName);
		
		boolean r1 = stringLength.and(stringContain).test("Welcome");
		
		boolean r2 = stringLength.or(stringContain).test("Welcome");
		
		System.out.println(r1);
		System.out.println(r2);
		
		List<Integer> numberList = List.of(1,2,3,4,5,6);
		Predicate<List<Integer>> listOfNumbers = l->{
			for(int l1:l) {
				if(l1>=6) {
					return false;
				}
			}
			return true;
		};
		System.out.println(listOfNumbers.test(numberList));
	}

}

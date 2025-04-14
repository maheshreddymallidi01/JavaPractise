package com.practise.FunctionalProgramming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MethodReferenceApp {

	public static void main(String[] args) {
	        List<Person> people = List.of(
	                new Person("Steve", 40),
	                new Person("Brit", 22),
	                new Person("Adam", 27),
	                new Person("Anna", 32),
	                new Person("Kumar", 91),
	                new Person("Anna", 4),
	                new Person("Anna", 12));
	        
	        
	        List<Integer> numbers = List.of(12, 23, 45, 45, 67, 12, 34, 87, 102);
	        Set<Integer> numbersSet = ConstructorMethodReference.transform(numbers, HashSet::new);
	        System.out.println(numbersSet);

	        Set<Person> personSet = ConstructorMethodReference.transform(people, TreeSet::new);
	        System.out.println(personSet);

	}

}

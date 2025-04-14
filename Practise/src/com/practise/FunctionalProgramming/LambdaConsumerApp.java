package com.practise.FunctionalProgramming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LambdaConsumerApp {

	public static void main(String[] args) {
		Consumer<Integer> doubleNumber = (n-> System.out.println(n*2));
		doubleNumber.accept(10);
		
		Consumer<List<Integer>> multiplyNumbers = list -> {
			for(int i=0;i<list.size();i++) {
				list.set(0,list.get(i)*3);
			}
		};

		List<Integer> numbers = Arrays.asList(5,4,3,2,1);
		multiplyNumbers.accept(numbers);
		System.out.println(numbers);
		
		Consumer<List<String>> displayWords = list->{
			list.forEach(System.out::println);
		};
		
		List<String> name = Arrays.asList("Mahesh", "Java", "Developer");
		displayWords.accept(name);
	}

}

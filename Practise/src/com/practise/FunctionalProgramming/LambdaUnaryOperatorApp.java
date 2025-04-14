package com.practise.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class LambdaUnaryOperatorApp {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(1,2,3,4,5,6);
		
		System.out.println(elements(numberList,n->n*n));
		List<Integer> numberList1 = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(elements(numberList1,n->n*n));
		
		List<String> stringList = List.of("Mahesh","MMR","MRM");
		System.out.println(elements(stringList, n->n+n));

	}

	private static <T> List<T> elements(List<T> numbers, UnaryOperator<T> operator){
		List<T> outputNumbers = new ArrayList<>();
		for(T number : numbers) {
			outputNumbers.add(operator.apply(number));
		}
		
		return outputNumbers;
	}
	
}

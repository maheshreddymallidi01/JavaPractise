package com.practise.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class LambdaBiFunctionApp {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double> powerofNumber = (m,n)->Math.pow(m, n);
		System.out.println(powerofNumber.apply(10, 2));
		
		BiFunction<Integer, Integer, List<Integer>> numbers = ((m,n)->{
			List<Integer> generateNumbers = new ArrayList<>();
			for(int i=0;i<m;i++) {
				generateNumbers.add(i*n);
			}
			return generateNumbers;
		});
		System.out.println(numbers.apply(10, 2));
	}

}

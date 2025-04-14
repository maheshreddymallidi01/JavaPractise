package com.practise.FunctionalProgramming;

import java.util.Random;
import java.util.function.Supplier;

public class LambdaSupplierApp {

	public static void main(String[] args) {

		Supplier<Integer> result = ()->{
			Random randomNumber = new Random();
			return randomNumber.nextInt(1000)+1;
		};
		
		System.out.println(result.get());

	}

}

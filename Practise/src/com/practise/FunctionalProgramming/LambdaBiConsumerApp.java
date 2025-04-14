package com.practise.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class LambdaBiConsumerApp {

	public static void main(String[] args) {
		BiConsumer<Integer, String> doubleNumberBi = ((n, t)-> System.out.println(t+": "+n*2));
		doubleNumberBi.accept(10,"price");
		
		BiConsumer<List<Integer>,Integer> multiplyNumbersBi = (list,number) -> {
			for(int i=0;i<list.size();i++) {
				list.set(0,list.get(i)*number);
			}
		};
		
		List<Integer> numbersBi = Arrays.asList(5,4,3,2,1);
		multiplyNumbersBi.accept(numbersBi,10);
		System.out.println(numbersBi);

	}

}

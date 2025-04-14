package com.practise.collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListApp {

	public static void main(String[] args) {

		int[] num = new int[3];
		num[0]=2;
		num[1]=1;
		num[2]=3;
		
		for(int nums:num) {
			System.out.println(nums);
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(7);

		System.out.println(numbers);
		
		List<Integer> naturalNumbers = new ArrayList<>();
		naturalNumbers.add(1);
		naturalNumbers.add(2);
		naturalNumbers.add(3);
		naturalNumbers.add(4);
		naturalNumbers.add(5);
		
		List<Integer> nnL = naturalNumbers.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("nnL"+nnL);
		
		naturalNumbers.addAll(numbers);
		System.out.println(naturalNumbers);
		
		System.out.println(naturalNumbers.contains(6));
		System.out.println(naturalNumbers.containsAll(numbers));
		naturalNumbers.forEach((n)->{
			if(n%2==0) {
				System.out.println(n);
			}
		});
		
		System.out.println(naturalNumbers.lastIndexOf(5));
		System.out.println(naturalNumbers.removeIf(n->(n%2!=0)));
		System.out.println(naturalNumbers);
		
		System.out.println(naturalNumbers.retainAll(numbers));
		System.out.println(naturalNumbers);

		
		List<Product> products = new ArrayList<>();
		Product onePlus = new Product("One Plus", 28000, "Nord Series");
		products.add(new Product("Samsung", 17000, "Galaxy Model"));
		products.add(onePlus);
		products.add(new Product("Nokia", 7000, "Windows Software"));
		
		List<Product> pp = products.stream().sorted(Comparator.comparing(Product::getName)).toList();
		System.out.println("PP"+pp);
		
		System.out.println(products);
		
		for(Product product:products) {
			System.out.println(product);
		}
		System.out.println(products.contains(onePlus));
		products.forEach(p->System.out.println(p));
		products.removeIf(p->p.getName().equals("One Plus"));
		System.out.println(products);
		
		products.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getRate))
				.forEach(p -> System.out.println(p));
		
		
	}

}

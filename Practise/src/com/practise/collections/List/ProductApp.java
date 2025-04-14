package com.practise.collections.List;

import java.util.ArrayList;

public class ProductApp {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		Product mobile = new Product("Samsung",17000,"Galaxy Series");
		Product earPhones = new Product("Realme",1800,"Wireless");
		
		products.add(mobile);
		products.add(earPhones);
		System.out.println(products);
		for(Product product : products) {
			System.out.println(product);
		}
		
		ArrayList<String> items = new ArrayList<>();
		items.add("Glasses");
		items.add("Shoes");
		
		for(String item:items) {
			System.out.println(item);
		}
		
		ArrayList<String> books= (ArrayList<String>) items.clone();
		try {
		System.out.println(books.get(2));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of Bound");
		}
		
	}
}

package com.practise.collections.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<String> toDoList = new LinkedList<>();
		if(!(toDoList.isEmpty())) {
			System.out.println(toDoList.getFirst());
		}
		toDoList.add("Udemy");
		toDoList.add("Login");
		toDoList.add("Logoff");
		System.out.println(toDoList);
		toDoList.push("Wake Up");
		System.out.println(toDoList);
		toDoList.offer("Sleep");
		System.out.println(toDoList);
		toDoList.pop();
		System.out.println(toDoList);
		System.out.println(toDoList.peekFirst());
		System.out.println(toDoList);
//		toDoList.clear();
//		System.out.println("Pop function removes "+toDoList.pop());
		System.out.println("Poll function removes "+toDoList.poll());
		System.out.println(toDoList);
		for(String toDo:toDoList) {
			System.out.println(toDo);
		}
		toDoList.forEach(System.out::println);
		
		LinkedList<Product> products = new LinkedList<>();
		Product mobile = new Product("Samsung",17000,"Galaxy Series");
		Product earPhones = new Product("Realme",1800,"Wireless");
		
		products.add(mobile);
		products.add(earPhones);
		
		for(Product product : products) {
			System.out.println(product);
		}
		
		System.out.println();
		
		LinkedList<String> workItems = new LinkedList<>();
		if(!(workItems.isEmpty())) {
			System.out.println(workItems.getFirst());
		}
		System.out.println(workItems.peekFirst());
		workItems.add("Udemy");
		workItems.add("Login");
		workItems.push("Wake Up");
		workItems.offer("Sleep");
		
		
		
	}

}

package com.practise.collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsPractiseApp {

	public static void main(String[] args) {
		Set<String> name = new HashSet<>();
		name.add("mmr");
		name.add("mahesh");
		name.add("mahesh");
		name.add(null);
		
		System.out.println(name);
		name.clear();
		System.out.println(name);
		
		name.add("mmr");
		name.add("mahesh");
		name.add("mahesh");
		name.add(null);
		name.forEach(System.out::println);
		name.toArray();
		name.forEach(System.out::println);

	}

}

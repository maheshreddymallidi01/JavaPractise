package com.practise.collections.Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapPractise {

	public static void main(String[] args) {
		Map<String,String> capitals = new HashMap<>();
		capitals.put("India", "Delhi");
		capitals.put("England", "London");
		capitals.put(null, "There are no values");
		System.out.println(capitals);
		if(!capitals.containsKey("Russia")) {
			System.out.println(capitals.get(null));
		}
		
		System.out.println(capitals.getOrDefault("USA", "No Values"));
		
		capitals.putIfAbsent("USA", "New York");
		System.out.println(capitals);
		
		capitals.remove(null);
		for(String capital:capitals.keySet()) {
			System.out.println(capital+"-"+capitals.get(capital));
		}
		for(Map.Entry m:capitals.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		capitals.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		Map<String,String> afterSorting = capitals.entrySet().stream().sorted(Map.Entry.comparingByKey()).peek(System.out::println)
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		System.out.println(afterSorting);
		 System.out.println("----------------");
		
		Map<String,String> capitalsLinkedHashMap = new LinkedHashMap<>();
		capitalsLinkedHashMap.put("India", "Delhi");
		capitalsLinkedHashMap.put("England", "London");
		for(String capital:capitalsLinkedHashMap.keySet()) {
			System.out.println(capital+"-"+capitalsLinkedHashMap.get(capital));
		}
		Map<String, Double> productPricesTreeMap = new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5);
        productPricesTreeMap.put("Pasta", 1.1);
        productPricesTreeMap.put("Cereals", 1.7);
        productPricesTreeMap.put("Apple", 0.15);

        System.out.println();
        System.out.println("TreeMap:");
        for (String product : productPricesTreeMap.keySet()) {
            System.out.println(product + " $" + productPricesTreeMap.get(product));
        }
	}

}

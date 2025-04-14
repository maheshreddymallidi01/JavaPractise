package com.practise.Generics;

import java.util.ArrayList;

import com.practise.collections.List.Product;

public class GenericApp {

	public static void main(String[] args) {
		Box<Product> product = new Box<>();
		product.setType(new Product("Realme",1800,"Wireless"));
		Util.dislayToString(product);

		Box<String> blueBox = new Box<>();
		blueBox.setType("blue");
		Box<String> redBox = new Box<>();
		redBox.setType("15");
		Util.dislayToString(blueBox);
		
		ArrayList<Box<String>> boxArray = new ArrayList<>();
		boxArray.add(blueBox);
		boxArray.add(redBox);
		
		ArrayList<Box<String>> boxArrayTwo = new ArrayList<>();
		boxArrayTwo.add(redBox);
		boxArrayTwo.addAll(boxArray);
		Util.dislayToString(boxArrayTwo);
		
		OrderedPair<Integer, String> orderedPairM = new OrderedPair<Integer, String>(90, "Mahesh");
		Util.dislayToString(orderedPairM);
		OrderedPair<Integer, String> orderedPair = new OrderedPair<Integer, String>(90, "Mallidi");
		ArrayList<OrderedPair<Integer, String>>  orderedArray = new ArrayList<>();
		orderedArray.add(orderedPairM);
		orderedArray.add(orderedPair);
		Util.dislayToString(orderedArray);
		
	}

}

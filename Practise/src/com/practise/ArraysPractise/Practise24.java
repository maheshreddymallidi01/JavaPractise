package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class Practise24 {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,1,1};
		int[] a2 = {1,2,1};
		Arrays.stream(a1).filter(x->Arrays.stream(a2).anyMatch(y->y==x)).distinct().forEach(System.out::println);
	}

}

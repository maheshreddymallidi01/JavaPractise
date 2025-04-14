package com.practise.ArraysPractise;

import java.util.List;
import java.util.stream.IntStream;

public class Practise36 {

	public static void main(String[] args) {
		int num = 2932;
		System.out.println(minimumSum(num));
	}

	private static int minimumSum(int num) {
		int n1 = 0;
		int n2 = 0;
		List<Integer> arr = IntStream.iterate(num, i->i/10).limit(String.valueOf(num).length()).map(x->(int)x%10).sorted().boxed().toList();
		n1 = (arr.get(0)*10)+arr.get(3);
		n2 = (arr.get(1)*10)+arr.get(2);
		return n1+n2;
	}

}

package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practise8 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		List<Integer> arrList = Arrays.stream(arr).boxed().toList();
		Integer sum = arrList.stream().reduce(0,Integer::sum);
		List<Integer> result = arrList.stream().map(i->i+sum).collect(Collectors.toList());
		System.out.println(result);
	}

}

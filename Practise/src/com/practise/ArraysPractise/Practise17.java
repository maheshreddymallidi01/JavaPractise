package com.practise.ArraysPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise17 {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int[] out = getConcatenation(nums);
		System.out.println(Arrays.toString(out));
	}
	
	private static int[] getConcatenation(int[] nums) {
        List<Integer> n = Arrays.stream(nums).boxed().toList();
        Stream<Integer> s = Stream.concat(n.stream(),n.stream());
        List<Integer> result = s.collect(Collectors.toList());
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}

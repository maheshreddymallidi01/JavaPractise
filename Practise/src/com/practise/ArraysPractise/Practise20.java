package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Practise20 {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies,extraCandies));
	}
	
	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
        List<Integer> candiesList = Arrays.stream(candies).boxed().toList();
        int max = candiesList.stream().max((x,y)->x-y).get();
        for(int i=0;i<candies.length;i++) {
        	if((candies[i]+extraCandies)>=max) {
        		result.add(true);
        	}
        	else {
        		result.add(false);
        	}
        }
        return result;
    }

}

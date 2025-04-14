package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Practise31 {

	public static void main(String[] args) {
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		String[] rr = sortPeople(names, heights);
		for(String r:rr) {
			System.out.println(r);
		}
	}
	
	private static String[] sortPeople(String[] names, int[] heights) {
		List<String> result = new ArrayList<>();
        Map<Integer, String> r = new HashMap<>();
        for(int j=0;j<names.length;j++) {
        	r.put(heights[j],names[j]);
        }
        Map<Integer,String> resultMap = r.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        for(Map.Entry<Integer, String> resultM:resultMap.entrySet()) {
        	result.add(resultM.getValue());
        }
        return result.toArray(new String[result.size()]);
    }
}

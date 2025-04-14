package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPractise21 {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));
	}
	
	private static String sortSentence(String s) {
		StringBuilder str = new StringBuilder();
        Map<Integer,String> r = new HashMap<>();
        for(String sp:s.split(" ")) {
        	int index = sp.charAt(sp.length()-1)-'0';
        	String actualWord = sp.substring(0,sp.length()-1);
        	r.put(index, actualWord);
        }
//        Map<Integer,String> sortedResult = r.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        for(Map.Entry<Integer, String> rr: r.entrySet()) {
        	str.append(rr.getValue());
        	str.append(" ");
        }
        return str.toString().trim();
    }
}

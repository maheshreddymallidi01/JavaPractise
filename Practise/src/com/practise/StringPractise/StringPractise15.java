package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPractise15 {

	public static void main(String[] args) {
		List<List<String>> items = List.of(Arrays.asList("phone","blue","pixel"),
				Arrays.asList("computer","silver","lenovo"),
				Arrays.asList("phone","gold","iphone"));
		String ruleKey = "color", ruleValue = "silver";
		System.out.println(countMatches(items,ruleKey,ruleValue));
	}
	
	private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
        for(int i=0;i<items.size();i++){
            List<String> o = items.get(i);
            if(ruleKey.equals("type")&&o.get(0).equals(ruleValue)) {
            	count++;
            }
            else if(ruleKey.equals("color")&&o.get(1).equals(ruleValue)) {
            	count++;
            }
            else if(ruleKey.equals("name")&&o.get(2).equals(ruleValue)){
            	count++;
            }
        }
        return count;
    }

}

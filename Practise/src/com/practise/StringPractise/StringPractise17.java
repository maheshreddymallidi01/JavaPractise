package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractise17 {

	public static void main(String[] args) {
		String[] strs = {"Welcome","to","Hyderabad","Enjoy","your","weekend"};
		String str = "Mahesh Mallidi";
		List<String> strM = Arrays.asList(str.split(" "));
		System.out.println(strM);
		List<String> strList = new ArrayList<>(Arrays.asList(strs));
		List<String> result = strList.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(result);
		String[] ss = strList.toArray(new String[strList.size()]);
		for(String s:ss) {
			System.out.println(s);
		}
	}

}

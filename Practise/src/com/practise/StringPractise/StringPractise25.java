package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringPractise25 {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		scan.nextLine();
		List<String> str = new ArrayList<>();
		for(int i=0;i<n;i++) {
			str.add(scan.nextLine());
		}
		List<Integer> p = new ArrayList<>();
		for(int j=0;j<n;j++) {
			p.add(scan.nextInt());
		}
		Map<String, Integer> mmr = new HashMap<>();
		for(int k=0;k<n;k++) {
			mmr.put(str.get(k), p.get(k));
		}
		Map<String,Integer> result = mmr.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		for(Map.Entry<String, Integer> r:result.entrySet()) {
			count+= r.getValue();
			if(count<=x) {
				System.out.println(r.getKey()+" - "+r.getValue());
			}
		}
	}
	

}

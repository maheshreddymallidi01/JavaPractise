package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise1 {

	public static void main(String[] args) {
		String sentence = "I have a sentence with technical words";
		String Languages = "Telugu Telugu Tamil Hindi Hindi";
		List<String> str = Arrays.asList(sentence.split(" "));
		Map<Integer, List<String>> r = str.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(r);
		
		System.out.println(MinNumber(Languages));
		
		int a = 1_2;
		double b = 0.1_2;
		System.out.println(a);
		System.out.println(b);
		
		List<EmployeeLocDep> emp = Arrays.asList(
				new EmployeeLocDep("abc", 26, "male", "IT"),
				new EmployeeLocDep("xyz", 23, "female", "IT"),
				new EmployeeLocDep("mno", 30, "male", "HR"),
				new EmployeeLocDep("abc", 26, "male", "IT"));
		
		Set<EmployeeLocDep> st = new HashSet<>();
		List<EmployeeLocDep> result = emp.stream().filter(x->st.add(x)).collect(Collectors.toList());
		System.out.println(result);
		
		Set<EmployeeLocDep> st1 = new HashSet<>();
		st1.add(new EmployeeLocDep("abc", 26, "male", "IT"));
		st1.add(new EmployeeLocDep("abc", 26, "male", "IT"));
		System.out.println(st1);
	}

	private static String MinNumber(String languages) {
		List<String> strL = Arrays.asList(languages.split(" "));
		int min = Integer.MAX_VALUE;
		String r = "";
		Map<String, Integer> mmr = new HashMap<>();
		for(int i=0;i<strL.size();i++) {
			if(mmr.containsKey(strL.get(i))) {
				mmr.put(strL.get(i), mmr.get(strL.get(i))+1);
			}
			else {
				mmr.put(strL.get(i), 1);
			}
		}
		
		for(Map.Entry<String, Integer> rr: mmr.entrySet()) {
			if(rr.getValue()<min) {
				min = Math.min(rr.getValue(), min);
				r = rr.getKey();
			}
		}
		return r;
	}

}

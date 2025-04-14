package Practise;

import java.util.HashMap;
import java.util.Map;

public class Practise10 {

	public static void main(String[] args) {
		String str = "Welcome to Infosys";
		int max = Integer.MIN_VALUE;
		char ch = '\0';
		Map<Character, Integer> mmr = new HashMap<>();
		for(char c:str.toCharArray()) {
			if(mmr.containsKey(c)) {
				mmr.put(c, mmr.get(c)+1);
			}else {
				mmr.put(c, 1);
			}if(mmr.get(c)>max) {
				max = mmr.get(c);
				ch= c;
			}
		}
		System.out.println(max);
		System.out.println(ch);
	}

}

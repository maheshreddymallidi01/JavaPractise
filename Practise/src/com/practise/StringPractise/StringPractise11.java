package com.practise.StringPractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPractise11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String jewels = scan.next();
		String stones = scan.next();
		System.out.println(numJewelsInStones(jewels,stones));
	}

	private static int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for(int i=0;i<stones.length();i++) {
			char ch = stones.charAt(i);
			if(jewels.contains(String.valueOf(ch))) {
				count++;
			}
		}
		return count;
	}

}

package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DistanceOfWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String str1 = scan.next();
		String str2 = scan.next();
		if(str1.equals(str2)) {
			System.out.println("Distance is 0");
		}else {
			System.out.println("Distance is "+distanceOfWords(sentence,str1,str2));
		}

	}

	private static int distanceOfWords(String sentence, String str1, String str2) {
		int d = 0;
		List<String> sArr = new ArrayList<>(Arrays.asList(sentence.split(" ")));
		int index1 = sArr.indexOf(str1);
		int index2 = sArr.indexOf(str2);
		d = index2-index1-1;
		return d;
	}

}

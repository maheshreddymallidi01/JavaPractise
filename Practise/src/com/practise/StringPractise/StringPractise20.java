package com.practise.StringPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractise20 {

	public static void main(String[] args) {
		String s = "n a ro XBlvtpOnAh nc xKRPeYqG IioAbUh wOx xaY D CE u Wkyrslk F dn DH W u Tn wZHmz Q D b HqWkyK uQ taJxaXmh zI yLzMmC ucKdK tHH WJ m B";
		int k = 15;
		System.out.println(truncateSentence(s,k));
	}
	
	private static String truncateSentence(String s, int k) {
		return Arrays.stream(s.split(" ")).map(x->x.trim()).limit(k).collect(Collectors.joining(" "));
	}

}

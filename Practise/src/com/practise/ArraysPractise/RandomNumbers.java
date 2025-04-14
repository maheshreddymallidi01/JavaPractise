package com.practise.ArraysPractise;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Random r = new Random();
		r.ints(1,100).limit(n).forEach(System.out::println);
	}

}

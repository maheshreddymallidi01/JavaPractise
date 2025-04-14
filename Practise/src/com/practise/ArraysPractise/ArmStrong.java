package com.practise.ArraysPractise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(armStrong(n)) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}

	private static boolean armStrong(int n) {
		int length = String.valueOf(n).length();
		int r = IntStream.iterate(n, i->i/10).limit(length).map(j->(int)Math.pow(j%10, length)).sum();
		if(n==r) {
			return true;
		}
		return false;
	}

}

package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		System.out.println("Value when row="+row+" and column="+col+" is "+findValue(row,col));
		int n =  scan.nextInt();
		System.out.println("value of "+n+"th row in a Pascal's Triangle is:");
		for(int r:generateRow(n)) {
			System.out.print(r+" ");
		}
		int p = scan.nextInt();
		System.out.println("Pascal's Triangle of "+p+"rows");
		for(List<Integer> r:pascalsTriangle(p)) {
			for(int rr:r) {
				System.out.print(rr+" ");
			}
			System.out.println();
		}
	}
	
	private static List<List<Integer>> pascalsTriangle(int p) {
		List<List<Integer>> r = new ArrayList<>();
		for(int i=1;i<=p;i++) {
			r.add(generateRow(i));
		}
		return r;
	}

	private static List<Integer> generateRow(int n) {
		List<Integer> r = new ArrayList<>();
		int ans = 1;
		r.add(ans);
		for(int i=1;i<n;i++) {
			ans = ans*(n-i);
			ans = ans/i;
			r.add(ans);
		}
		return r;
	}

	private static int findValue(int row, int col) {
		int r = row-1;
		int c = col-1;
		int res = 1;
		for(int i=0;i<c;i++) {
			res = res*(r-i);
			res = res/(i+1);
		}
		return res;
	}

}

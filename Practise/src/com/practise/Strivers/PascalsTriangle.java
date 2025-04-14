package com.practise.Strivers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		System.out.println("Pascal's Triangle of "+p+"rows");
		for(int[] r:pascalTriangle(p)) {
			for(int rr:r) {
				System.out.print(rr+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] pascalTriangle(int N) {
        // Write your code here.
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=N;i++){
            result.add(generateRow(i));
        }
        return result.stream().map(x->x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new);
    }

    public static List<Integer> generateRow(int n){
        List<Integer> r = new ArrayList<>();
        int ans = 1;
        r.add(ans);
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            r.add(ans);
        }
        return r;
    }

}

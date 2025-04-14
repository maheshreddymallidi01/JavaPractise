package com.practise.ArraysPractise;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int l = Math.min(n1, n2);
		int gcd = 0;
		for(int i=l;i>=1;i--) { //O(min(n1,n2))
			if(n1%i==0&&n2%i==0) {
				gcd = i;
				break;
			}else {
				continue;
			}
		}
		System.out.println(gcd);
		
		int a = n1;
		int b = n2;
		while(a>0&&b>0) { //O(logpi(min(a,b)))
			if(a>b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		if(a==0) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
	}

}

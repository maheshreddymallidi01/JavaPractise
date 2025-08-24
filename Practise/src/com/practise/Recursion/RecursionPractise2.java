package com.practise.Recursion;

public class RecursionPractise2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		reverseOfArray(0,arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		String str = "madam";
		System.out.println(palindrome(0,str.length(),str));
		
		String str2 = "Reverse";
		System.out.println(reverseOfString(str2));
	}
	
	private static String reverseOfString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverseOfString(str.substring(1))+str.charAt(0);
	}
	
	private static boolean palindrome(int i,int n,String str) {
		if(i>=n) {
			return true;
		}
		if(str.charAt(i)!=str.charAt(n-1)) {
			return false;
		}
		return palindrome(i+1,n-1,str);
	}
	
	private static void reverseOfArray(int i,int[] arr) {
		if(i>arr.length/2) {
			return;
		}
		swap(i,arr.length-i-1,arr);
		reverseOfArray(i+1,arr);
	}
	
	private static void swap(int i, int n, int[] arr) {
		int temp = arr[i];
		arr[i]=arr[n];
		arr[n]=temp;
	}

}

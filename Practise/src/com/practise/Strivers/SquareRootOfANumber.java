package com.practise.Strivers;

public class SquareRootOfANumber {

	public static void main(String[] args) {
		long N = 6;
		System.out.println(sqrtN(N));
	}

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		int low = 1;
		int high = (int)N;
		while(low<=high){
			int mid = (low+high)/2;
			long val = (long)mid*mid;
			if(val<=N){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return high;
	}
}

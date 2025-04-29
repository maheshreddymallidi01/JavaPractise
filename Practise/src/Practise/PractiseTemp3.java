package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class PractiseTemp3 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 9 };
		int k = 10;
		System.out.println(sumOfK(arr, k));
		int[] arr2 = {-1,1,1};
		int k2 =1;
		System.out.println(sumOfK2(arr2,k2));
	}

	private static int sumOfK(int[] arr, int k) {
		int count = Integer.MIN_VALUE;
		int left = 0;
		int right = 0;
		int sum = 0;
		while (right < arr.length) {
			sum += arr[right];
			while (left < right && sum > k) {
				sum = sum - arr[left];
				left++;
			}
			if (sum == k) {
				count = Math.max(count, right - left + 1);
			}
			right++;
		}
		return count;
	}
	
	private static int sumOfK2(int[] arr2 , int k2) {
		int count = Integer.MIN_VALUE;
		int sum = 0;
		Map<Integer, Integer> mmr = new HashMap<>();
		for(int i=0;i<arr2.length;i++) {
			sum += arr2[i];
			if(sum==k2) {
				count = Math.max(count, i+1);
			}
			int rem = sum-k2;
			if(mmr.containsKey(rem)) {
				int len = i- mmr.get(rem);
				count = Math.max(count, len);
			}
			if(!mmr.containsKey(sum)) {
				mmr.put(sum, i);
			}
		}
		return count;
	}
}
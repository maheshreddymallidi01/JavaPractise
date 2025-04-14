package Practise;

import java.util.HashMap;
import java.util.Map;

public class Practise4 {

	public static void main(String[] args) {
		int n = 5;
		int k = 10;
		int[] arr = {2,3,5,1,9};
		int n1 = 3;
		int k1 = 1;
		int[] arr1 = {-1,1,1};
		int[] arrT = {2,6,5,8,11};
		int target = 14;
		int[] mid = {2,0,2,1,0,1};
		int[] prices = {7,1,5,3,6,4};
		System.out.println(LongestSubArray(arr,n,k));
		System.out.println(LongestSubArray1(arr1,n1,k1));
		System.out.println(TwoSum(arrT,target));
		for(int r: Sorting(mid)) {
			System.out.print(r+" ");
		}
		System.out.println();
		System.out.println(SellAndBuy(prices));
	}

	private static int SellAndBuy(int[] prices) {
		int p = 0;
		int mini = prices[0];
		int sell = prices[0];
		for(int i=0;i<prices.length;i++) {
			mini = Math.min(mini, prices[i]);
			sell = prices[i]-mini;
			p = Math.max(sell, p);
		}
		return p;
	}

	private static int[] Sorting(int[] mid) {
		int low = 0;
		int m = 0;
		int high = mid.length-1;
		while(m<=high) {
			if(mid[m]==0) {
				int temp = mid[low];
				mid[low] = mid[m];
				mid[m] = temp;
				low++;
				m++;
			}
			else if(mid[m]==1) {
				m++;
			}else {
				int temp = mid[high];
				mid[high] = mid[m];
				mid[m] = temp;
				high--;
			}
		}
		return mid;
	}

	private static boolean TwoSum(int[] arrT, int target) {
		Map<Integer, Integer> mmr = new HashMap<>();
		int rem = 0;
		for(int i=0;i<arrT.length;i++) {
			rem = target-arrT[i];
			if(mmr.containsKey(rem)) {
				return true;
			}else {
				mmr.put(arrT[i], i);
			}
		}
		return false;
	}

	private static int LongestSubArray1(int[] arr1, int n1, int k1) {
		int r = 0;
		int sum = 0;
		int rem = 0;
		Map<Integer, Integer> mmr = new HashMap<>();
		for(int i=0;i<n1;i++) {
			sum += arr1[i];
			if(sum==k1) {
				r = Math.max(r, i+1);
			}
			rem = sum-k1;
			if(mmr.containsKey(rem)) {
				int len = i-mmr.get(rem);
				r = Math.max(r, len);
			}else {
				mmr.put(sum, i);
			}
		}
		return r;
	}

	private static int LongestSubArray(int[] arr,int n,int k) {
		int r = 0;
		int sum = 0;
		int left = 0;
		int right = 0;
		while(right<n) {
			while(sum>k&&left<=right) {
				sum = sum-arr[left];
				left++;
			}
			sum += arr[right];
			
			if(sum==k) {
				r = Math.max(r, right-left+1);
			}
			right++;
		}
		return r;
	}
}

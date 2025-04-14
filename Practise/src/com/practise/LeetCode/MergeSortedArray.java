package com.practise.LeetCode;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		int m = 3; 
		int n = 3;
		merge(nums1, m, nums2, n);
		for(int r:nums1) {
			System.out.print(r+" ");
		}
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
         
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}

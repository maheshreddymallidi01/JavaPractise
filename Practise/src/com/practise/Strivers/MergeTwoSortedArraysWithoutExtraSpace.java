package com.practise.Strivers;

public class MergeTwoSortedArraysWithoutExtraSpace {

	public static void main(String[] args) {
		long []a = {1,4,5,7};
		long []b = {2,3,6};
		mergeTwoSortedArraysWithoutExtraSpace(a, b);
		for(long r:a) {
			System.out.print(r+" ");
		}
		System.out.println();
		for(long r:b) {
			System.out.print(r+" ");
		}
	}

	public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int n = a.length;
        int m = b.length;
        int len = n+m;
        int gap = (len/2)+(len%2);
        while(gap>0){
            int left = 0;
            int right = left+gap;
            while(right<len){
                if(left<n&&right>=n){
                    swapIfGreater(a, b,left,right-n);
                }else if(left>=n){
                    swapIfGreater(b, b,left-n,right-n);
                }else{
                    swapIfGreater(a, a,left,right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap = (gap/2)+(gap%2);
        }
    }

    private static void swapIfGreater(long []a,long []b, int ind1,int ind2){
        if(a[ind1]>b[ind2]){
            long temp = a[ind1];
            a[ind1] = b[ind2];
            b[ind2] = temp;
        }
    }
}

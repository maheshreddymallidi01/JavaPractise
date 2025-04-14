package com.practise.Strivers;

public class SortedCheck {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n = 5;
		System.out.println(isSorted(n, a));
	}

	private static int isSorted(int n, int []a) {
        int mini = a[0];
        for(int i=0;i<n;i++){
            if(mini>a[i]){
                return 0;
            }
            mini = a[i];
        }
        return 1;
    }
}

package com.practise.Strivers;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n = 5;
		int[] r = getSecondOrderElements(n, a);
		for(int t:r) {
			System.out.print(t+" ");
		}
	}
	
	public static int[] getSecondOrderElements(int n, int []a) {
        int l = a[0];
        int s = a[0];
        for(int i=0;i<n;i++){
            if(l<a[i]){
                l = a[i];
            }
            if(a[i]<s){
                s = a[i];
            }
        }

        int secondL = -1;
        int secondS = l;
        for(int j=0;j<n;j++){
            if(a[j]>secondL&&a[j]!=l){
                secondL = a[j];
            }
            if(a[j]<secondS&&a[j]!=s){
                secondS = a[j];
            }
        }
        return new int[]{secondL,secondS};
    }

}

package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.List;

public class Practise32 {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}

	private static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+2;j<arr.length;){
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                }
                j = j+2;
            }
        }
        return sum;
    }
}

package com.practise.ArraysPractise;

import java.util.ArrayList;
import java.util.List;

public class Practise16 {

	public static void main(String[] args) {
		int[] arr = {9,10,14,3,-4,11,-12,-15,22};
		List<Integer> pArr = new ArrayList<>();
		List<Integer> nArr = new ArrayList<>();
		int pN = 0;
		int nN = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pArr.add(arr[i]);
				pN++;
			}else {
				nArr.add(arr[i]);
				nN++;
			}
		}
		System.out.println(pArr);
		System.out.println(pN);
		System.out.println(nArr);
		System.out.println(nN);
	}

}

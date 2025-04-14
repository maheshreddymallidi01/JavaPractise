package Practise;

import java.util.Arrays;
import java.util.List;

public class PractiseArrays {

	public static void main(String[] args) {
		int[] a = {10,20,9,50,6,26};
		int[] b = {10,20,30,40,50};
		System.out.println(largest(a));
		System.out.println(larger(a));
//		System.out.println(sorted(b));
	}
	
	private static int largest(int[] a) {
		int r = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>r) {
				r = a[i];
			}
		}
		return r;
	}
	
	private static int larger(int[] a) {
		List<Integer> arr = Arrays.stream(a).boxed().toList();
		return arr.stream().max((x,y)->x-y).get();
	}

}

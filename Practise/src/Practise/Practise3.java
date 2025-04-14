package Practise;

import java.util.HashMap;
import java.util.Map;

public class Practise3 {

	public static void main(String[] args) {
		int[] a = {1,1,1,1,2,2,2,3,3,4};
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;
		int r = 0;
		Map<Integer, Integer> mmr = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(mmr.containsKey(a[i])) {
				mmr.put(a[i], mmr.get(a[i])+1);
			}else {
				mmr.put(a[i], 1);
			}
			if(mmr.get(a[i])>max) {
				max = mmr.get(a[i]);
			}
			if(mmr.get(a[i])>sMax&&mmr.get(a[i])<max) {
				sMax = mmr.get(a[i]);
				r = a[i];
			}
		}
		System.out.println(sMax);
		System.out.println(r);
	}
}
package Practise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PractiseTemp6 {

	public static void main(String[] args) {
		int[] arr = { 100, 200, 1, 3, 2, 4 };
		System.out.println(longestConsecutiveSubArray(arr));
		System.out.println();
		int[] arr2 = { 11, 33, 33, 11, 33, 11 };
		for (int i : majorityElements(arr2)) {
			System.out.println(i + " ");
		}
	}

	private static int longestConsecutiveSubArray(int[] arr) { // 100, 200, 1, 3, 2, 4
		int c = 0;
		int longest = Integer.MIN_VALUE;
		Set<Integer> mmr = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			mmr.add(arr[i]);
		}

		for (int i : mmr) {
			if (!mmr.contains(i - 1)) {
				c = 1;
				int x = i;
				while (mmr.contains(x + 1)) {
					x += 1;
					c += 1;
				}
				longest = Math.max(c, longest);
			}
		}
		return longest;
	}

	private static int[] majorityElements(int[] arr2) {
		List<Integer> r = new ArrayList<>();
		int c1 = 0, c2 = 0;
		int e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr2.length; i++) {
			if (c1 == 0 && e2 != arr2[i]) {
				c1 = 1;
				e1 = arr2[i];
			} else if (c2 == 0 && e1 != arr2[i]) {
				c2 = 1;
				e2 = arr2[i];
			} else if (e1 == arr2[i]) {
				c1++;
			} else if (e2 == arr2[i]) {
				c2++;
			} else {
				c1--;
				c2--;
			}
		}

		c1 = 0;
		c2 = 0;
		int min = (int) (arr2.length / 3) + 1;
		for (int i = 0; i < arr2.length; i++) {
			if (e1 == arr2[i])
				c1++;
			else if (e2 == arr2[i])
				c2++;
		}
		if (c1 >= min)
			r.add(e1);
		if (c2 >= min)
			r.add(e2);
		return r.stream().mapToInt(Integer::intValue).toArray();
	}

}

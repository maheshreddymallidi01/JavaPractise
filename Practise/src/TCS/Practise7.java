package TCS;

import java.util.Arrays;
import java.util.Collections;

public class Practise7 {

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		Integer[] output = reverse(arr);
		for(Integer o:output) {
			System.out.println(o);
		}
	}
	
	private static Integer[] reverse(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
		return arr;
	}

}

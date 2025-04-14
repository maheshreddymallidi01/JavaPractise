package TCS;

import java.util.Arrays;
import java.util.List;

public class Practise8 {

	public static void main(String[] args) {
		Integer[] arr = {0,1,0,1,0,1,1,1,0,0};
		List<Integer> arr1 = Arrays.asList(arr);
		int m = arr1.stream().reduce(1,(a,b)->a+b);
		System.out.println(arr.length+1-m);
	}

}

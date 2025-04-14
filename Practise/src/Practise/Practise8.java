package Practise;

import java.util.Comparator;
import java.util.List;

public class Practise8 {

	public static void main(String[] args) {
		List<Integer> arr = List.of(1,2,3,4,5,6,7,8,9,10);
		
		arr.stream().filter(x->x%2==0).sorted(Comparator.reverseOrder()).forEach(y->System.out.println(y));
	}

}

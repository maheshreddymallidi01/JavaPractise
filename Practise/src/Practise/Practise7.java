package Practise;

import java.util.Arrays;
import java.util.List;

public class Practise7 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("2","5","7","10","11","13","20");
		str.stream().map(x->Integer.valueOf(x)).filter(y->y%2!=0).forEach(i->System.out.println(i));
	}

}

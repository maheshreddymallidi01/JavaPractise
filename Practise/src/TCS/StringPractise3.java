package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPractise3 {

	public static void main(String[] args) {
		String[] str = {"Mahesh","Reddy","Mallidi"};
		List<String> str1 = Arrays.asList(str);
		String output = str1.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
		System.out.println(output);
	}

}

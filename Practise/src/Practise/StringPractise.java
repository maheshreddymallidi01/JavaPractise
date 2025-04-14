package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringPractise {

	public static void main(String[] args) {
		String[] str = { "Mahesh", "Bhaskar", "Devi", "Mahesh", "Bhaskar" };
		System.out.println(getResultByCollection(str));
		String[] r = getResultBySet(str);
		for (String rr : r) {
			System.out.println(rr);
		}
		String[] r2 = getResult(str);
		for (String rr : r2) {
			System.out.println(rr);
		}

	}

	private static List<String> getResultByCollection(String[] str) {
		List<String> strC = Arrays.asList(str);
		return strC.stream().filter(n -> Collections.frequency(strC, n) > 1).distinct().toList();
	}

	private static String[] getResultBySet(String[] str) {
		Set<String> strS = new HashSet<>();
		List<String> r = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			if (!strS.add(str[i])) {
				r.add(str[i]);
			}
		}
		return r.toArray(new String[0]);
	}

	private static String[] getResult(String[] str) {
		Set<String> strS = new HashSet<>();
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					strS.add(str[i]);
					break;
				}
			}
		}
		return strS.stream().collect(Collectors.toList()).toArray(new String[0]);
	}

}

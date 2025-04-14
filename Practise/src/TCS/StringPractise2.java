package TCS;

import java.util.stream.IntStream;

public class StringPractise2 {

	public static void main(String[] args) {

		String name = "CloudTech";

		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'C') {
				temp += name.charAt(i);
			}
		}
		System.out.println(temp);

		System.out.println(name.replaceAll("C", ""));
		
		StringBuilder newName = new StringBuilder(name);
		System.out.println(newName.reverse().equals(name));
		String m = new String("Mahesh");
		System.out.println(m.indexOf(name));
		String palindromeCheck = "madam";
		if (palindrome(palindromeCheck)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

	private static Boolean palindrome(String input) {
		/*
		 * char[] ch = input.toCharArray(); for(int i=0;i<ch.length/2;i++) {
		 * if(ch[i]!=ch[ch.length-1-i]) { return false; } } return true;
		 */
		return IntStream.range(0, input.length())
				.noneMatch(i -> input.charAt(i) != input.charAt(input.length() - 1 - i));
	}
}

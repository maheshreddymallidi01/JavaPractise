package TCS;

import java.util.Scanner;

public class StringPractise {

	public static void main(String[] args) {

		String s = "Mahesh";
		
		/*
		 * Scanner scan = new Scanner(System.in); String s = scan.next();
		 */		
		/*
		 * StringBuilder str = new StringBuilder(); str.append(s);
		 * System.out.println(str.reverse());
		 */
		
		char[] ch = s.toCharArray();
		String rev ="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}

		System.out.println(rev);
		
		System.out.println(s.compareTo("Kumar"));
		
		System.out.println(s.compareToIgnoreCase("kumar"));
		String str = new String("Mahesh");
		String a = "meow";
		String arr[] = {"meow","bow"};
		System.out.println(a==arr[0]);
		String ab = a+"deal";
		System.out.println(ab);
		String abc = "meowdeal";
		System.out.println(abc==ab);
	}

}

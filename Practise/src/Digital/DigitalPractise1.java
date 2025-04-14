package Digital;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DigitalPractise1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value:");
		int n1 = scan.nextInt();
		System.out.println("Enter second value:");
		int n2 = scan.nextInt();
		int count = 0;
		for(int i=n1;i<=n2;i++) {
			int num = i;
			if(checkUnRepeated(num)) {
				count += 1;
			}
		}
		System.out.println(count);
	}

	private static boolean checkUnRepeated(int num) {
		int rem= 0;
		HashSet<Integer> hs = new HashSet<>();
		while(num>0) {
			rem = num%10;
			if(hs.contains(rem)) {
				return false;
			}
			hs.add(rem);
			num = num/10;
		}
	
		return true;
	}

}

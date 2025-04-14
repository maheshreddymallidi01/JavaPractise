package TCS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int r=scan.nextInt();
		System.out.println(Calculate(l,r));
	}

	static int Calculate(int l, int r) {
		int result=0;
		for(int i=l;i<=r;i++) {
			result+=Same(i);
		}
		return result;
	}
	
	static int Same(int n) {
		LinkedHashSet<Integer> s=new LinkedHashSet<>();
		int d = 0;
		while(n!=0) {
			d=n%10;
			if(s.contains(d)) {
				return 0;
			};
			s.add(d);
			n=n/10;
		}
		return 1;
	}

}

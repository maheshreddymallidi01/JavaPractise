package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		
		List<Integer> t1=new ArrayList<>();
		List<Integer> t2=new ArrayList<>();
		for(int i=0;i<k;i++) {
			t1.add(a[i]);
		}
		for(int i=k;i<n;i++) {
			t2.add(a[i]);
		}
		t2.addAll(t1);
		
		for(Integer t:t2) {
			System.out.print(t+" ");
		}
	}

}

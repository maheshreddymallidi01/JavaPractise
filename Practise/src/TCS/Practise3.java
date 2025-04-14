package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		List<Integer> t1=new ArrayList<>();
		List<Integer> t2=new ArrayList<>();
		for(int i=0;i<n;i++) {
			
			if(a[i]%10==0) {
				t2.add(a[i]);
			}else {
				t1.add(a[i]);
			}
		}
		t1.addAll(t2);
		for(Integer t:t1) {
			System.out.print(t+" ");
		}
	}

}

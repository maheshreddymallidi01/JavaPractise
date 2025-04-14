package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
//		System.out.println(Arrays.toString(a));
		for(int i=0;i<k;i++) {
			int temp=a[n-1];
			for(int j=n-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}

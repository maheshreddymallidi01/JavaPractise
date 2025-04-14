package TCS;

import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
		int n,a=0,b=3,result;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				a+=2;
				if(i==1)
					b=3;
				else
					b+=4;
				result=a*b;
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}

}

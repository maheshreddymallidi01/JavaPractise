package TCS;

import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r1,r2,n,result=0;
		double x,h;
		r1=scan.nextInt();
		r2=scan.nextInt();
		n=scan.nextInt();
		x=scan.nextInt();
		h=Math.ceil(x/60);
		for(int i=1;i<=h;i++) {
			if(i<=n) {
				result+=r1;
			}else {
				result+=r2;
			}
		}
		System.out.println(result);
	}

}

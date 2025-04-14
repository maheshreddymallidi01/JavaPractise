package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practise2 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] d = {1,1,1,2,2,3,3,4};
		int[] m = {1,2,3,4,5};
		int[] n = {1,2,3,4,5,6,7};
		int[] z = {1,2,3,0,4,0,1,0,0,5};
		int[] s = {1,2,3,5};
		int[] mc = {1,1,0,1,1,1,0,1};
		int[] ao = {4,1,2,1,2};
		int dd = 2;
		int max = Integer.MIN_VALUE;
		int sMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				sMax = max;
				max = a[i];
			}
			if(a[i]>sMax&&a[i]!=max) {
				sMax = a[i];
			}
		}
		System.out.println(sMax);
		System.out.println(Sorted(a));
		for(int r: RemoveDuplicates(d)) {
			System.out.print(r+" ");
		};
		System.out.println("");
		for(int r: RotateByOne(m)) {
			System.out.print(r+" ");
		}
		System.out.println("");
		for(int r: RotateByD(n, dd)) {
			System.out.print(r+" ");
		}
		System.out.println("");
		for(int r: MoveZeros(z)) {
			System.out.print(r+" ");
		}
		System.out.println("");
		System.out.println(MissingNumber(s));
		System.out.println(MissingNumberXor(s));
		System.out.println(MaxConsecutive(mc));
		System.out.println(AppearsOnce(ao));
	}
	
	private static boolean Sorted(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	private static int[] RemoveDuplicates(int[] d) {
		int j = 0;
		for(int i=0;i<d.length;i++) {
			if(d[j]!=d[i]) {
				j++;
				d[j] = d[i];
			}
		}
		return d;
	}
	
	private static int[] RotateByOne(int[] m) {
		int temp = m[0];
		for(int i=0;i<m.length-1;i++) {
			m[i] = m[i+1];
		}
		m[m.length-1] = temp;
		return m;
	}

	private static int[] RotateByD(int[] n, int dd) {
		reverse(0,dd-1,n);
		reverse(dd,n.length-1,n);
		reverse(0,n.length-1,n);
		return n;
	}
	
	private static void reverse(int a, int b, int[] n) {
		while(a<=b) {
			int temp = n[a];
			n[a] = n[b];
			n[b] = temp;
			a++;
			b--;
		}
	}
	
	private static int[] MoveZeros(int[] z) {
		int j = 0;
		for(int i=0;i<z.length;i++) {
			if(z[i]!=0) {
				int temp = z[i];
				z[i] = z[j];
				z[j] = temp;
				j++;
			}
		}
		return z;
	}
	
	private static int MissingNumber(int[] s) {
		int sum = ((s.length+1)*(s.length+2))/2;
		int sum2 = 0;
		for(int i=0;i<s.length;i++) {
			sum2 += s[i];
		}
		int sumList = Arrays.stream(s).boxed().toList().stream().reduce(0, (a,b)->a+b);
		return sum-sumList;
	}
	
	private static int MissingNumberXor(int[] s) {
		int xor = 0;
		int xor2 = 0;
		for(int i=0;i<s.length-1;i++) {
			xor = xor^s[i];
			xor2 = xor2^i+1;
		}
		xor2 = xor2^s.length;
		return xor2^xor;
	}
	
	private static int MaxConsecutive(int[] mc) {
		int maxCnt = 0;
		int cnt = 0;
		for(int i=0;i<mc.length;i++) {
			if(mc[i]==1) {
				cnt += 1;
			}else {
				cnt = 0;
			}
			maxCnt = Math.max(maxCnt, cnt);
		}
		return maxCnt;
	}
	
	private static int AppearsOnce(int[] ao) {
		int xor = 0;
		for(int i=0;i<ao.length;i++) {
			xor = xor^ao[i];
		}
		return xor;
	}
}

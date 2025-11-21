package Practise;


public class PractiseDSA {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		System.out.println(missingNumber(arr,5));
	}
	
	private static int missingNumber(int[] arr,int n) {
		int xor1 = 0;
		int xor2 = 0;
		for(int i=0;i<n-1;i++) {
			xor1 = xor1^arr[i];
			xor2 = xor2^i+1;
		}
		
		xor2 = xor2^n;
		
		return xor1^xor2;
	}
	

}

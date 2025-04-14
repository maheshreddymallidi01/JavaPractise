package com.practise.Strivers;

public class SingleElement {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3};
		System.out.println(getSingleElement(arr));
		System.out.println(getSingleElementXor(arr));
	}

	private static int getSingleElement(int []arr){
        int i = 0;
        int j =1;
        while(i<arr.length&&j<arr.length){
            if(arr[i]==arr[j]){
                i+=2;
                j+=2;
            }
            else{
                return arr[i];
            }
        }
        return arr[i];
    }
	
	private static int getSingleElementXor(int []arr){
        int xor1 = 0;
        for(int i=0;i<arr.length;i++){
            xor1 = xor1^arr[i];
        }
        return xor1;
    }
}

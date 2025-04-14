package com.practise.StringPractise;

public class StringPractise14 {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s,indices));
	}
	
	private static String restoreString(String s, int[] indices) {
        String finalStr = "";
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            finalStr = finalStr+s.charAt(indices[i]);
        }
        return finalStr;
    }
}

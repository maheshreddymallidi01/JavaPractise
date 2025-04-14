package com.practise.StringPractise;

public class StringPractise8 {

	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(countHighest(sentences));
	}

	private static int countHighest(String[] sentences) {
		int count = 0;
        for(int i=0;i<sentences.length;i++){
            String[] str = sentences[i].split(" ");
            int length = str.length;
            if(length>count){
                count = length;
            }
        }
        return count;
	}

}

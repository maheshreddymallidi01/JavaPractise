package com.practise.StringPractise;

public class StringPractise9 {

	public static void main(String[] args) {
		String[] operations = {"--X","X++","X++"};
		System.out.println(afterOperations(operations));
	}

	private static int afterOperations(String[] operations) {
		int x = 0;
		String a = "X++", b = "++X", c = "X--", d = "--X";
        for(int i=0;i<operations.length;i++){
            if(a.equals(operations[i])||b.equals(operations[i])){
                x = x+1;
            }else if(c.equals(operations[i])||d.equals(operations[i])){
                x = x-1;
            }else{
                continue;
            }
        }
        return x;
	}

}

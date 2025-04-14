package Practise;

public class ABC implements A1,B1{
	public int msg(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		A1 a = new ABC();
		System.out.println(a.msg(10,10));
	}
}
interface A1{
	int msg(int a, int b);
}

interface B1{
	int msg(int a, int b);
}
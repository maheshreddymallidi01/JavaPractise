package Practise;

public class StaticPractise {

	static int x = 10;
	
	void change() {
		x = 12;
	}
	
	public static void main(String[] args) {
		xyz();
	}
	
	public static void xyz() {
		StaticPractise sp = new StaticPractise();
		sp.change();
		System.out.println(x);
	}
}

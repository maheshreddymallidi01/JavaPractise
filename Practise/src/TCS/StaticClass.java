package TCS;

public class StaticClass {

	public static void main(String[] args) {
		StaticKeyword count = new StaticKeyword(2,1);
    	System.out.println(count.getRate());
		System.out.println(StaticKeyword.counterValue(2));
		StaticKeyword.setCounter(20);
		System.out.println(StaticKeyword.counterValue(2));
	}

}

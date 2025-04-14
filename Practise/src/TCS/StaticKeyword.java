package TCS;

public class StaticKeyword {
	private static int counter;
	private final int rate;
	
	public int getRate() {
		return rate;
	}

	StaticKeyword(int rate, int counter ) {
		this.rate = rate;
		StaticKeyword.counter = counter;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		StaticKeyword.counter = counter;
	}

	static {
		counter = 10;
	}
	
	public static int counterValue(int count) {
		return counter+=count;
	}
	
}

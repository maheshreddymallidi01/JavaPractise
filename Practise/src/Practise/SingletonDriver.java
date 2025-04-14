package Practise;

class Singleton{
	private volatile static Singleton instance;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

public class SingletonDriver {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		if(instance1==instance2) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
	}

}

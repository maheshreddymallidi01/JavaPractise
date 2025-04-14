package Practise;

public class Practise5 {

	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.msg();
		Ex.update();
		Ex ex = new Ex();
		Bike b = new Bike();
		System.out.println(b.speed);
	}

}

class Parent{
	protected void msg() {
		System.out.println("Parent");
	}
}


class Child extends Parent{
	protected void msg() {
		System.out.println("Child");
	}
}

class Ex{
	static int x= 5;
	static void update(){
		x = 6;
	}
	
	Ex(){
		x=7;
		System.out.println(x);
	}
}

class Bike{
	final int speed;
	Bike(){
		speed = 180;
	}
}

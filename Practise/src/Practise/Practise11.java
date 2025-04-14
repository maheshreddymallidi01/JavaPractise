package Practise;

public class Practise11 extends PQR{

	public static void main(String[] args) {
		
	}

	@Override
	void sayHi() {
		System.out.println();
		
	}

	@Override
	void sayHiTwice() {
		System.out.println();
		
	}
}


abstract class XYZ{
	abstract void sayHi();
	void sayHello() {
		System.out.println("Hello");
	}
}


abstract class MNO extends XYZ implements DEF{
	@Override
	void sayHi() {
		
	}
}

abstract class PQR extends XYZ{
	abstract void sayHiTwice();	
}


interface DEF{
	
}
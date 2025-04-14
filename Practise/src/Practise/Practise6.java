package Practise;

import java.io.IOException;

public class Practise6 {
	public static void main(String[] args) {
		A a = new A();
		a.p();
		B.x();
		try {
			C.age(13);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class A{
	void m() throws IOException{
		throw new IOException("IO Exception");
	}
	
	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

class B{
	static void x() {
		try {
			int a = 10/0;
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println("Rest of code");
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}

class C{
	static void age(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid Age");
		}else {
			System.out.println("Valid Age");
		}
	}
}

interface D{
	void msg() throws IOException;
}

class E implements D{
	public void msg() throws IOException{
		System.out.println("ABC");
	}
}
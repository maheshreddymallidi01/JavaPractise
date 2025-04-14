package com.practise.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalProgrammingApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		WelcomeMessage welcomeMessage = new WelcomeMessage();
		
		Greeter greeter2;
		if(userInput.equalsIgnoreCase("loggedIn")) {
			greeter2 = ()->System.out.println("Logged In");
		}else if(userInput.equalsIgnoreCase("loggedOff")) {
			greeter2 = ()->System.out.println("Logged Off");
		}else {
			greeter2 = ()->System.err.println("User Undefined");
		}
		
		
		welcomeMessage.greet(greeter2);
		Greeter greeter1 = new Greeter1();
		welcomeMessage.greet(greeter1);
		welcomeMessage.greet(()->System.out.println("Hi"));
		
		Greet greet;
		greet = ()->System.out.println("Greet");
		greet.display();
		Greet greet2;
		greet2 = ()->System.out.println("Greet2");
		greet2.display();
		
		Greet greet1 = new Greet1();
		greet1.display();
		
		List<Integer> inputNumbers = List.of(1,2,3,4,5);
		
		CalculationMethod calculationMethod = new CalculationMethod();
		Operands operands;
		operands = n -> n*n;
		List<Integer> outputNumbers = calculationMethod.doubleTheNumber(inputNumbers, operands);
		System.out.println(outputNumbers);
		
		
		
	}

}

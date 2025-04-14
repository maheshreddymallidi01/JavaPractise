package com.practise.Objects.Pizza;

public class PizzaApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		PizzaSize pizza = PizzaSize.LARGE;
		System.out.println(pizza.getPizzaSizeText());
		for(PizzaSize pizzaSize: PizzaSize.values()) {
			System.out.println("- "+pizzaSize.getPizzaSizeText());
		}
		Pizza vegPizza = new Pizza("VegPizza", PizzaSize.MEDIUM);
		System.out.println(vegPizza.getName()+" and "+vegPizza.getPrice()+" and "+vegPizza.getPizzaSize().getPizzaSizeText());
		
		Pizza vegPizzaClone = (Pizza) vegPizza.clone();
		System.out.println(vegPizzaClone.getName()+" and "+vegPizzaClone.getPrice()+" and "+vegPizzaClone.getPizzaSize().getPizzaSizeText());
		
		System.out.println(vegPizza.equals(vegPizzaClone));
		
		System.out.println("-------------------------------------");
		System.out.println(vegPizza.getName());
		System.out.println(vegPizza.getClass());
		System.out.println(vegPizza.hashCode());
		System.out.println(vegPizzaClone.hashCode());
		
		System.out.println("-------------------------------------");
		System.out.println(vegPizza.toString());
	}
}

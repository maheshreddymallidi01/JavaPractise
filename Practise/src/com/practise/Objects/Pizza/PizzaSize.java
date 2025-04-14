package com.practise.Objects.Pizza;

public enum PizzaSize {
	SMALL("Small Size"),
	MEDIUM("Medium Size"),
	LARGE("Large Size");
	
	private String pizzaItemNames;
	
	PizzaSize(String pizzaItemNames) {
		this.pizzaItemNames = pizzaItemNames;
	}
	
	public String getPizzaSizeText() {
		return pizzaItemNames;
	}
}

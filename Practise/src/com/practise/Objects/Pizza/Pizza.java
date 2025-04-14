package com.practise.Objects.Pizza;

import java.util.Objects;

public class Pizza implements Cloneable {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    }
    
    @Override
    public boolean equals(Object obj) {
    	if(this == obj) {
    		return true;
    	}
    	if(!(obj instanceof Pizza)) {
    		return false;
    	}
    	Pizza pizza = (Pizza) obj;
    	return Objects.equals(pizza.name, name) &&
    			pizza.pizzaSize == pizzaSize && 
    			pizza.price == price;
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return super.hashCode();
    }
    
    @Override
    public String toString() {
    	return name+" "+pizzaSize+" "+price;
    }
}

package com.practise.collections.List;

public class Product {
	private String name;
	private double rate;
	private String desc;
	public Product(String name, double rate, String desc) {
		super();
		this.name = name;
		this.rate = rate;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" costs "+rate+" and is "+desc;
	}
}

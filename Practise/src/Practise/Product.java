package Practise;

public class Product {
	private int id;
	private String name;
	private String product;
	private int cost;
	public Product(int id, String name, String product, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", product=" + product + ", cost=" + cost + "]";
	}
	
}

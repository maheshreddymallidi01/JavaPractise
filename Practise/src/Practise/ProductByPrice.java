package Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductByPrice {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Java","Book",150);
		Product p2 = new Product(102,"Spring","Book",300);
		Product p3 = new Product(103,"Html","Book",100);
		Product p4 = new Product(104,"CSS","Book",250);
		Product p5 = new Product(105,"Nokia","Phone",3000);
		Product p6 = new Product(106,"Samsung","Phone",1500);
		Product p7 = new Product(107,"Lenovo","Phone",250);
		
		List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		Map<String,Product> result = productList.stream().filter(i->i.getProduct().equals("Phone")).collect(Collectors.groupingBy(Product::getProduct,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Product::getCost)), Optional::get)));
		Set<Entry<String,Product>> phoneWithLessPrice = result.entrySet();
		for(Entry<String,Product> phone: phoneWithLessPrice) {
			String name = phone.getKey();
			Product details = phone.getValue();
			System.out.println(name);
			System.out.println(details.getId());
			System.out.println(details.getName());
			System.out.println(details.getProduct());
			System.out.println(details.getCost());
			System.out.println(phone.getValue());
		}
		System.out.println(result);
	}

}

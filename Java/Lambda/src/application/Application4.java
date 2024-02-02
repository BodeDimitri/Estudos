package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product4;
import util.ProductService;

public class Application4 {

	public static void main(String[] args) {
		
		List<Product4> list = new ArrayList<>();
		
		list.add(new Product4("Tv", 900.00));
		list.add(new Product4("Mouse", 50.00));
		list.add(new Product4("Tablet", 350.50));
		list.add(new Product4("HD Case", 80.90));

		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00); // A função recebe um parametro de uma função lambda
		
		
		System.out.println(sum);
		
	}

}

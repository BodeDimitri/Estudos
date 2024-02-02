package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//import java.util.function.Consumer;

import entities.Product2;
import util.PriceUpdateConsumer;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Product2> list = new ArrayList<>();
		
		list.add(new Product2("Tv", 900.00));
		list.add(new Product2("Mouse", 50.00));
		list.add(new Product2("Tablet", 350.50));
		list.add(new Product2("HD Case", 80.90));
		
		list.forEach(new PriceUpdateConsumer()); //Interface
		//list.forEach(Product2::staticPriceUpdate); //Metodo statico
		//list.forEach(Product2::nonstaticPriceUpdate);
		
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1); //Lambda declarada
		//list.forEach(cons);
		
		//list.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //Lammbda Inline
		
		
		list.forEach(System.out::println);
	}

}

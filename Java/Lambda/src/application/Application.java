package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice() <= 100.00); //Expresão lambda
		//list.removeIf(new ProductPredicate()); //A expressão lambda foi trocada por uma interface funcional 
		list.removeIf(Product::staticProductPredicate); //Method reference, os dois pontos duplo e usado para apontar para o metodo
		list.removeIf(Product::nonstaticProductPredicate); //Method reference não estatico
		
		double min = 100.00;
		
		Predicate<Product> prod = p -> p.getPrice() <= min; //Mais facil para usar variaveis que alguem digitou
		list.removeIf(prod);
		
		list.removeIf(p -> p.getPrice() <= min); //Expressão lambda declarada direto mas usando variavel
		
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}

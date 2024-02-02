package util;

import java.util.List;
import java.util.function.Predicate;

import entities.Product4;

public class ProductService {

	public double filteredSum(List<Product4> list, Predicate<Product4> criteria) { //Predicate vai ser usado como uma função dentro de uma função
		double sum = 0.0;
		for (Product4 p : list) {
			if (criteria.test(p)) { // Assim podemos escolher como vai ser testado
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
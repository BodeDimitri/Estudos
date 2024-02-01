package services;

import java.util.List;

public class CalculationService { //Basicamente ele permite você escolher o tipo que vai ser usado na lista

	public static <T extends Comparable<T>> T max(List<T> list) { // Esse metodo vai trabalhar com um tipo T
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		T max = list.get(0);
		for (T item : list) { // Cada elemento da lista vai ser um tipo T
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
package enteties;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { //Generics
	
	List<T> list = new ArrayList<>();
	
	public PrintService() {
		
	}
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
			
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for(int n = 1; n < list.size(); n++) {
			System.out.println(list.get(n));
		}
		System.out.println("]");
	}
	
}

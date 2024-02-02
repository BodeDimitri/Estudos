package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationPipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(3, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0) //Filtra a stream se baseando no Lambda que foi passado
				.map(x -> x * 10) //Aplicado o map
				.collect(Collectors.toList()); //Transforma para list
		System.out.println(Arrays.toString(newList.toArray())); //List to array -> Array to String -> Exibido na tela
	}

}

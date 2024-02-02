package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product3;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product3> list = new ArrayList<>();
		
		list.add(new Product3("Tv", 900.00));
		list.add(new Product3("Mouse", 50.00));
		list.add(new Product3("Tablet", 350.50));
		list.add(new Product3("HD Case", 80.90));
		
		//map função que aplica uma função a todos elementos de uma stream
		//List<String> names = list.stream().map(new UperCaseFunction()).collect(Collectors.toList()); //Pega a lista e transforam em stream, usa o map para aplicar a interface e transforma em lista novamente 
		//List<String> names = list.stream().map(Product3::staticUpperCaseName).collect(Collectors.toList()); //Usando metodo statico
		//List<String> names = list.stream().map(Product3::nonstaticUpperCaseName).collect(Collectors.toList()); //Usando metodo 
		
		//Function<Product3, String> fun =  p -> p.getProduct().toUpperCase(); //Declarada
		
		//List<String> names = list.stream().map(fun).collect(Collectors.toList()); 
		
		List<String> names = list.stream().map(p -> p.getProduct().toUpperCase()).collect(Collectors.toList()); //Inline
		
		names.forEach(System.out::println); //Para cada item da linhas names -> faça isso
		
	}

}

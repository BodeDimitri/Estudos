package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product5;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o path: ");
		
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product5> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product5(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream() //transforma para lista
					.map(p -> p.getPrice()) //na lista pega o preço
					.reduce(0.0, (x,y) -> x + y) / list.size(); // Soma tudo e depois dividi pelo tamanho para conseguir a média
			
			System.out.println("Avarage price:" + avg);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getProduct())
					.sorted(comp.reversed())//.reversed e una função de comparator que inverte a sequencia
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}

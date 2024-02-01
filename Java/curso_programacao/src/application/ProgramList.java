package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maioria dos metodos são iguais as outras linguagens
		List<String> list = new ArrayList<>(); //Não aceita tipos primitivos //List<Tipo usando wrapperclass> nome;
		
		list.add("Nome1");
		list.add("Nome2");
		list.add("Nome3");
		list.add(1, "Nome1.1"); //list.add(posição, obj)
		
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		list.removeIf(x-> x.charAt(4) == '1'); //RemoveIf e usado para passar um parametro para e exclusão 
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		System.out.println("Index do Nome1 " + list.indexOf("Nome2")); //Lembrando que vai ser 0 por causa da nossa recente exclusão
		
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x-> x.charAt(4) == '2').collect(Collectors.toList()); //Converte o list para stream e usa a função lambda e depois converte para lista novamente
		
		System.out.println(result);
		
		System.out.println("-----------------");
		
		String name = list.stream().filter(x-> x.charAt(4) == '2').findFirst().orElse(null); //Filtra usando a função lambda mas esse retorna apenas o primeiro obj encontrado na lista
		System.out.println(name);
	}
	

}

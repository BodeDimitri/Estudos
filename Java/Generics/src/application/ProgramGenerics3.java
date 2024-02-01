package application;

import java.util.Arrays;
import java.util.List;

public class ProgramGenerics3 {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("A", "E");
		printList(myStrs);
	}
		public static void printList(List<?> list) { //Metodo criado que aceita qualquer tipo pois foi usado o <?>
			//list.add(3); Porem não e possivel adicionar novos itens a lista
			for (Object obj : list) { //Agora le como tipo object a List 
				System.out.println(obj);
				}
		}
}
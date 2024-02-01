package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramSet {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();// Muito rapído mas pode misturar a ordem, não permite repetição
		//TreeSet ordena os dados alem de ter de inplementar o Comparable<>
		//LinkedHashSet manteve a ordem em que os elementos são inseridos
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//set.remove("Tablet"); Remove, ta no nome
		set.removeIf(x -> x.length() >= 3); //Remove seguindo uma condição
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
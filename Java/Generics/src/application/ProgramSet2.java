package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet2 {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
//union
		Set<Integer> c = new TreeSet<>(a); //Conjunto C vai ser uma copia do conjunto A
		c.addAll(b); //Junta o conjunto B com C
		System.out.println(c);
		
//intersection
		Set<Integer> d = new TreeSet<>(a); //Conjunto D vai ser uma copia de A
		d.retainAll(b); //Tudo que tiver em comun entre os conjuntos D e B vai se manter
		System.out.println(d);
		
//difference
		Set<Integer> e = new TreeSet<>(a); //Conjunto E vai ser uma copia de A
		e.removeAll(b); //Vai remover do conjunto E tudo o que esta no conjunto B
		System.out.println(e);
	}
	
}
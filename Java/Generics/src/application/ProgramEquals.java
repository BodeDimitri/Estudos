package application;

import entities.Client;

public class ProgramEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("A", "aa@.com"); 
		Client c2 = new Client("B", "b@.com");
		
		System.out.println(c1.hashCode()); //gera hashcode
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2)); //Mais lento mas a resposta e 100% exata
		
		System.out.println(c1 == c2); //Por terem sido criados com referencia de memoria diferentes eles vão sempre retornar falso, unico tratamento diferencial vai ser para tipos literais
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Products2;

public class ProgramProducts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome do modelo:");
		String Name = sc.nextLine();
		System.out.println("Preço:");
		Double Price = sc.nextDouble();
		System.out.println("Quantidade em estoque:");
		int Quantitiy = sc.nextInt();
		Products2 product = new Products2(Name, Price, Quantitiy); 
		
		
		System.out.println(product.toString());
		
		System.out.println("Quantos produtos foram adicionadois?");
		product.AddProducts(sc.nextInt());
		
		System.out.println(product.UpdatedProducts());
		
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Products;

public class ProgramProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products(); 
		System.out.println("Nome do modelo:");
		product.Name = sc.nextLine();
		System.out.println("Preço:");
		product.Price = sc.nextDouble();
		System.out.println("Quantidade em estoque:");
		product.Quantitiy = sc.nextInt();
		
		
		
		
		//System.out.printf("Nome: " + product.Name + "Preço: " + product.Price + "Quantidade: " + product.Quantitiy);
		
		System.out.println(product.toString());
		
		System.out.println("Quantos produtos foram adicionadois?");
		product.AddProducts(sc.nextInt());
		
		System.out.println(product.UpdatedProducts());
		
		sc.close();
	}

}

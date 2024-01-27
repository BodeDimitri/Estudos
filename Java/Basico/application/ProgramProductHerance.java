package application;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.ImportedProduct;
import enteties.ProductHerance;
import enteties.UsedProducts;

public class ProgramProductHerance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<ProductHerance> list = new ArrayList<>();
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira a quantidade de produtos: ");
		int nProdutos = sc.nextInt();
		
		for(int i = 1; nProdutos >= i; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.println("Comum, usado ou importado? (C/U/I)");
			
			char cui = sc.next().charAt(0);
			
			System.out.println("Nome: ");
			String name = sc.next();
			
			System.out.println("Preço: ");
			Double preco = sc.nextDouble();
			
			if (cui == 'I') {
				System.out.println("Taxa: ");
				Double precotaxa = sc.nextDouble();
				ProductHerance ph = new ImportedProduct(name, preco, precotaxa);
				list.add(ph);
			}
			if (cui == 'U') {
				System.out.println("Importado: ");
				String dataImportacao = sc.next();
				ProductHerance ph = new UsedProducts(name, preco, dataImportacao);
				list.add(ph);
			}
			if (cui == 'C') {
				ProductHerance ph = new ProductHerance(name, preco);
				System.out.println("Passou aqui");
				list.add(ph);
			}
		}
		System.out.println("Tags: ");
		for(ProductHerance c : list) {
			System.out.println(c.priceTag());
		}
		
		sc.close();
	}

}

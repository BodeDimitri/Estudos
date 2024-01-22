package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Products3;

public class ProgramProducts3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products3[] vect = new Products3[n]; //Array criada 
		
		for (int i = 0; n > i; i++) { //Não se esquça que e possivel usar o vect.length
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products3(name, price); //Vão ser guardados objetos na array da classe do Products3, que tem name e price
		}
		
		double sum = 0;
		for (int i = 0; n > i;i++) {
			sum += vect[i].getPrice(); //Acessando os itens no vect e usando o metodo que foi criado na outra classe para recebermos o valor do preço
		}
		
		double result = sum / n;
		System.out.printf("Média: %.2f", result);
		
		sc.close();

	}

}

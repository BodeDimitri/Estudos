package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double [n]; //Aqui dentro e colocada a quantidade de itens dentro da array
		
		for (int i = 0; n > i; i++) { 
			vect[i] = sc.nextDouble(); //A cada iteração e definido um valor para um objeto dentro da array		
		}
		
		double sum = 0.0;
		for (int i = 0; n > i; i++) {
			sum += vect[i]; //A cada iteração um número da nossa array e salvo para ser somado com o proxímo fazendo assim uma soma de todos eles
		}
		
		double result = sum / n; //Recebe o resultado anterior e divivi pela quantidade de n
		
		System.out.printf("Media: %.2f",result);
		sc.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHighierPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int quantidade;
		
		System.out.println("Quantos números você vai digitar?");
		quantidade = sc.nextInt();
		double[] num = new double[quantidade];

		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextDouble();

		}
		
		double max = num[0];
		int r = 0;
		
		for(int i=0; i < quantidade; i++) {
			if(max < num[i]) {
				max = num[i];
				 r = r + 1;
			}
		}
		
		System.out.printf("Maior número: %.2f",max);
		System.out.println("");
		System.out.printf("Posição do maior valor no index: %d",r);
		sc.close();
	}


}

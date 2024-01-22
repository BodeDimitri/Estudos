package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Height;

public class ProgramHeight {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas?");
		int pessoas = sc.nextInt();
		
		String name;
		int age;
		int underAge = 0;
		double height;
		double sum = 0;
		double resultunder = 0;
		Height[] vect = new Height[pessoas];
		
		
		for(int i = 0; pessoas > i; i++) {
			System.out.printf("Dados da %d pessoa",i + 1);
			System.out.println("");
			
			System.out.println("Nome: ");
			name = sc.next();
			
			System.out.println("Idade: ");
			age = sc.nextInt();
			
			System.out.println("Altura: ");
			height = sc.nextDouble();
			
			vect[i] = new Height(name, age, height);
		}
		
		for(int i = 0; pessoas > i; i++) {
			 sum = sum + vect[i].getHeight();
		}
		
		double result = sum / vect.length;
		System.out.printf("Altura média: %.2f", result);
		System.out.println("");

		for(int i = 0; pessoas > i; i++) {
			 if (vect[i].getAge() <= 16) {
				 underAge = 1 + underAge;
				 resultunder = (underAge* 100) / pessoas;
			}
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%", resultunder);
		System.out.println("");
		
		for(int i = 0; pessoas > i; i++) {
			 if (vect[i].getAge() <= 16) {
				 System.out.println(vect[i].getName());
			 } 
		} 
		
		sc.close();
	}
}

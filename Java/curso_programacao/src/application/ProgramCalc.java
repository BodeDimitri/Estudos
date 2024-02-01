package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Calc;


public class ProgramCalc {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o raio: ");
		double radius = sc.nextDouble();
		System.out.println("Entre o volume: ");
		double volume = sc.nextDouble();
		
		double c = Calc.circumference(radius);
		double v = Calc.volume(volume);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		
		
		sc.close();
	}
}

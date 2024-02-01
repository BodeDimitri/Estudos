package application;

import java.util.Locale;
import java.util.Scanner;

import enteties.Triangle; //Classe sendo importada

public class ProgramTriangle {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y; //Variavel sendo definida com a classe Triangle
		
		x = new Triangle(); //Triangulo(Objeto) sendo instanciado
		y = new Triangle(); //Triangulo(Objeto) sendo instanciado
		
		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble(); //Para acessar um atributo da classe e so digitar a variavel que foi instanciada um ponto e o nome do atributo 
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.areaCalc(); //Usando o metodo que foi importado, ja foi instanciado anteriormente e os valores ja foram passados, não precisa de parametros
		double areaY = y.areaCalc();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) { //Define tera a maior área
			
			System.out.println("Larger area: X");
		} else {
			
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
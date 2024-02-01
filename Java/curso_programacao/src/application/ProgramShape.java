package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import enteties.Circle;
import enteties.Rectangle;
import enteties.Shape;
import enteties.enums.Color;

public class ProgramShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Entre a quantidade de figuras: ");
		int nLados = sc.nextInt();
		
		for (int i = 1; nLados >= i; i++ ) {
			System.out.println("Figura #" + i + ": ");
			
			System.out.println("Retangulo ou Círculo: (R/C)?");
			char ch = sc.next().charAt(0);
			
			System.out.println("Qual color (Preto/Azul/Vermelho)");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'R') {
				System.out.println("Altura: ");
				Double height = sc.nextDouble();
				
				System.out.println("Largura: ");
				Double width = sc.nextDouble();
				
				Rectangle r = new Rectangle(color, width, height);
				list.add(r);
			}
			if (ch == 'C') {
				System.out.println("Raio: ");
				Double raio = sc.nextDouble();
				
				Circle c = new Circle(color, raio);
				list.add(c);
			}
		}
		
		System.out.println("");
		System.out.println("Areas: ");
		
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
		
		sc.close();
		
	}

}

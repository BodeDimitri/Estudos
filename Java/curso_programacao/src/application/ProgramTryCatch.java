package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCatch {

	public static void main(String[] args) {
		
		method1();
		System.out.println("O programa acabou");
	}
	
	public static void method1() {
		System.out.println("Metodo 1 começou");
		method2();
		System.out.println("Metodo 1 acabou");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		try { //Ele vai executar o código que esta dentro do try
			System.out.println("Metodo 2 começou");
			String[] vect = sc.nextLine().split(" ");
			
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) { //Caso de o erro escrito dentro do catch ele não vai cortar a execução do programa
			System.out.println("Erro no index"); //Ele vai executar o que estiver aqui dentro
			e.printStackTrace(); //Continua printando os erros que apareciam antes no terminal
		} catch(InputMismatchException e) {
			System.out.println("Erro no input");
			e.printStackTrace();
		}
		System.out.println("Metodo 2 acabou");
		sc.close();
	}

}

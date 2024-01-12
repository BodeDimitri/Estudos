import java.util.Scanner;

public class Bitwise {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000; //Equivalente a 32, tem seu 6 número com o bit 1
		int n = sc.nextInt(); //Coloca o número que vai ter o seu sexto bit testado
		
		if((n & mask) != 0) { //Caso o sexto bit não for zero
			System.out.println("Sexto bit e verdadeiro"); // Sexto bit e 1
		} else {
			System.out.println("Sexto bit e falso"); // Sexto bit e 0
		}
		sc.close();
	}
	
}

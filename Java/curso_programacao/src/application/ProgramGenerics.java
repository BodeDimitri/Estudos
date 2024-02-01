package application;

import java.util.Scanner;

import enteties.PrintService;

public class ProgramGenerics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.println("Quantos valores");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();

	}

}

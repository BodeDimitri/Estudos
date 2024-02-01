package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import enteties.AccountBank;
import model.exceptions.AccountException;

public class ProgramAccountExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre as informações: ");
			System.out.println("Numero da conta: ");
			int number = sc.nextInt();
			
			System.out.println("Nome do dono: ");
			String nome = sc.next();
			
			System.out.println("Quantia inicial: ");
			double quantiaInicial = sc.nextDouble();
			
			System.out.println("Quanto pode ser sacado:");
			double withdrawLimit = sc.nextDouble();
			
			AccountBank ac = new AccountBank(number, nome, quantiaInicial, withdrawLimit);
			
			System.out.println("Entre a quantia de saque: ");
			double saque = sc.nextDouble();
			
			ac.withdraw(saque);
			
			System.out.println("Quantia sacada: $" + ac.getBalance());
			
		} catch(AccountException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Algo foi digitado errado");
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
		
	}

}

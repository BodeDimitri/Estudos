package enteties;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String Holder = sc.nextLine();
		System.out.println("Is there a initial deposit? Y/N");
		char response = sc.nextLine().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialdeposit = sc.nextDouble();
			
			account = new Account(number, Holder, initialdeposit);
		} else {
			account = new Account(number, Holder);
		}
		
		System.out.println("");
		System.out.println("Account data:");
		System.out.println(account.toString());
		System.out.println("");
		
		System.out.println("Enter a deposit value:");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account:");
		System.out.println(account.toString());
		
		sc.close();
	}
}

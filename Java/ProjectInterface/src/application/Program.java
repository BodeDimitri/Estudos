package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.enteties.Contract;
import model.enteties.Installment;
import model.services.ContactService;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato");
		
		System.out.println("Numero: ");
		int number = sc.nextInt();
		
		System.out.println("Data (dd/MM/yy)");
		LocalDate date = LocalDate.parse(sc.next(), fmt); //LocalDate.parse aceita como parametro a formtação
		
		System.out.println("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		
		Contract contract = new Contract(number, date, valorContrato);
		
		System.out.println("Entre com o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContactService cs = new ContactService(null);
		
		cs.processContract(contract, parcelas);
		
		System.out.println("Parcelas");
		for (Installment instalments : contract.getInstalments()) {
			System.out.println(instalments);
		}
		
		sc.close();
	}
}

package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.enteties.CarRental;
import model.enteties.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm)");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt); //Usando fmt como parametro para o horario ficar correto
		System.out.println("Retorno (dd/MM/yy hh:mm)");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt); 
		
		CarRental cr = new CarRental(start, finish, new Vehicle (carModel)); //O 3 argumento e uma String mas na entidade e instanciada um Vehicle, então instanciamos um aqui tambem
		
		System.out.println("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

		sc.close();

	}

}
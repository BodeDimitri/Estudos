package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import enteties.Reservation3;
import model.exceptions.DomainException;

public class ProgramException3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Quarto: ");
			int number = sc.nextInt();
			
			System.out.println("Dia de check-in (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.println("Dia de check-out (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());
			
		
			System.out.println("Erro, data posterior a checkout");
	
			Reservation3 reservation  = new Reservation3(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			System.out.println("Entre a nova data de check-in:");
			checkIn = sdf.parse(sc.next());
			System.out.println("Entre a nova data de check-out:");
			checkOut = sdf.parse(sc.next());
			
	
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString()); //Sucesso
		} catch (ParseException e) { //Catch vai servir para pegar esse erros, que podem ocorrer na classe principal ou em uma das entidades
			System.out.println("Data invalida");
		} catch (DomainException e ) {
			System.out.println("Erro na reserva " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		
		sc.close();
	}
}



package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import enteties.Reservation;

public class ProgramExpectionsv1 {

	public static void main(String[] args) throws ParseException { //permite que seja lançada esse tipo de exceção
		//Solução ruim
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Quarto: ");
		int number = sc.nextInt();
		
		System.out.println("Dia de check-in (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.println("Dia de check-out (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) { //se checkOut for antes de checkIn
			System.out.println("Erro, data posterior a checkout");
		} else { //Caso de certo
			Reservation reservation  = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			System.out.println("Entre a nova data de check-in:");
			checkIn = sdf.parse(sc.next());
			System.out.println("Entre a nova data de check-out:");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date(); //Pega a data de hoje
			if (checkIn.before(now) || checkOut.before(now)) { //Não permite que a data seja antes de hoje
				System.out.println("Data de reservão tem de se tratar de data futuras"); //Erro caso a data for antes do dia de hoje
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Erro, data posterior a checkout");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation.toString()); //Sucesso
			}
		}
		sc.close();

	}

}

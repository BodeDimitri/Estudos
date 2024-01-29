package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import enteties.Reservation2;

public class ProgramException2 {

	public static void main(String[] args) throws ParseException {
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
			Reservation2 reservation  = new Reservation2(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation.toString());
			
			System.out.println();
			System.out.println("Entre a nova data de check-in:");
			checkIn = sdf.parse(sc.next());
			System.out.println("Entre a nova data de check-out:");
			checkOut = sdf.parse(sc.next());
			

			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Foi encontrado um erro, " + error);
			} else {
				System.out.println("Reservation: " + reservation.toString()); //Sucesso
			}
		}
		sc.close();

	}

}

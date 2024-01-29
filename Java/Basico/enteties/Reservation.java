package enteties;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	public Integer rommNumber;
	public Date checkin;
	public Date checkout;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer rommNumber, Date checkin, Date checkout) {
		super();
		this.rommNumber = rommNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRommNumber() {
		return rommNumber;
	}

	public void setRommNumber(Integer rommNumber) {
		this.rommNumber = rommNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public Long duration() {//checkin - checkout
		long diff = checkout.getTime() - checkin.getTime(); //Diferença entre as duas data em milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Usado para conversão de data// Primeiro parametro e a base e o segundo o tipo do tempo
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Quarto: " + this.rommNumber  + ", check-in: " + sdf.format(checkin) + ", check-out: " + sdf.format(checkout) + ", duração: " + duration() + " noites";
	}
	
}

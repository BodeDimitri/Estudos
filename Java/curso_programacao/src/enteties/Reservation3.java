package enteties;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation3 {
	public Integer rommNumber;
	public Date checkin;
	public Date checkout;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation3() {
		
	}

	public Reservation3(Integer rommNumber, Date checkin, Date checkout) throws DomainException {
		if (!checkout.after(checkin)) { //Sim, e possivel fazer isso no construtor tbm
			throw new  DomainException("Erro, data posterior a checkout");
		}
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
	
	public void updateDates(Date checkin, Date checkout) throws DomainException { 
		Date now = new Date(); //Pega a data de hoje
		if (checkin.before(now) || checkout.before(now)) { //Não permite que a data seja antes de hoje
			throw new DomainException("Data de reservão tem de se tratar de data futuras"); // throw para declarar um possivel erro
		}
		if (!checkout.after(checkin)) {
			throw new  DomainException("Erro, data posterior a checkout");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	
	@Override
	public String toString() {
		return "Quarto: " + this.rommNumber  + ", check-in: " + sdf.format(checkin) + ", check-out: " + sdf.format(checkout) + ", duração: " + duration() + " noites";
	}
}


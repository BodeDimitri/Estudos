package model.enteties;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	public Integer number;
	public LocalDate date;
	public Double totalValue;
	
	public List<Installment> instalments = new ArrayList<>(); // Foi instanciado em uma lista pois se trata de varios Instalments, como foi mostrado na UML

	public Contract(Integer number, LocalDate date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getInstalments() {
		return instalments;
	}
	
}

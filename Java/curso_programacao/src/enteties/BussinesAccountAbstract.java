package enteties;

public class BussinesAccountAbstract extends AccountAbstract {

	private Double loanLimit;
	

	public BussinesAccountAbstract(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) { 
			balance += amount - 10;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); //Usa o mesmo metodo da superclasse
		balance -= 2.0;
	}
	
}

package enteties;

public final class SavingsAccount extends AccountHerence { //final impede SavingsAccount de ser herdada
	private Double interestRate;
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate; 
	}
	
	@Override
	public final void withdraw(double amount) { //final tambem impede um metodo de ser sobreposto
		this.balance -= amount + 5;
	}
	
}

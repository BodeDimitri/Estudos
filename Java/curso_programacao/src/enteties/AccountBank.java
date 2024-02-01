package enteties;

import model.exceptions.AccountException;

public class AccountBank {
	public Integer number;
	public String holder;
	public Double balance;
	public Double withdrawLimit;
	
	public AccountBank() {
	}

	public AccountBank(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws AccountException {
		if (amount > this.balance) { //Quantia insuficiente
			throw new AccountException("Quantia insuficiente na conta");
		}
		if (amount > this.withdrawLimit) { //Excede
			throw new AccountException("A quantia excede o valor permitido na conta");
		}
		this.balance -= amount;
	}
	
}
package enteties;

public abstract class AccountAbstract { //Abstract não permite ser instanciada, ela e só uma base para as outras

	private int number;
	private String holder;
	protected double balance;
	
	public AccountAbstract(int number, String holder, double initialBalance) {
		this.number = number;
		this.holder = holder;
		deposit(initialBalance); 
	}

	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: "
				+ number
				+ " , Holder: "
				+ holder
				+ " , Balance: $"
				+ String.format("%.2f", balance);  //Primeiro e passado a maneira que vai ser formatada e depois o atributo
	}
}


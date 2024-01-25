package application;

import enteties.AccountHerence;
import enteties.BussinesAccount;
import enteties.SavingsAccount;

public class ProgramAccountHerance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BussinesAccount bacc = new BussinesAccount(100, "De", 0.0, 500.0); //Business ta escrito errado
		
		
		// Upcasting // Um objeto de subclasse que e atribuido a de uma super classe
		
		AccountHerence acc1 = bacc;
		acc1.getBalance();
		AccountHerence acc2 = new BussinesAccount(100, "Do", 0.0, 300.0);
		acc2.getBalance();
		AccountHerence acc3 = new SavingsAccount(1003, "Dz", 0.0, 0.01);
		
		// Downcasting // Superclasse -> Subclasse
		
		BussinesAccount acc4 = (BussinesAccount) acc2;
		acc4.loan(100.0);
		//acc2.loan(100,0); não funciona pois não e uma BussinessAccount
		
		//BussinesAccount acc5 = (BussinesAccount) acc3; // Não e pára isso funcionar originalmente pois não se trata propriamente de um objeto AccountHerance, quando executar vai causar erro pois SavingsAccount não e uma sublcasse de BussinessAccount
		if (acc3 instanceof BussinesAccount) { //instanceof checa se acc3 e uma BussinessAccount, no caso não e
			BussinesAccount acc5 = (BussinesAccount) acc3;
			acc5.loan(500.0);
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		//
		
		AccountHerence acc6 = new AccountHerence(1007, "Dx", 1000.0);
		acc6.withdraw(200);
		System.out.println(acc6.getBalance());
	}

}

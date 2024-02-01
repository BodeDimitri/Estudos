package model.services;

import java.time.LocalDate;

import model.enteties.Contract;
import model.enteties.Installment;

public class ContactService  {
	
	public OnlinePaymentService ops;
	
	public ContactService() {
		
	}

	public ContactService(OnlinePaymentService ops) {
		super();
		this.ops = ops;
	}
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue()  / months;
		
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = ops.interest(basicQuota, i); //((basicQuota/100) * i) + basicQuota;
			double fee = ops.paymentFee(basicQuota + interest); //((interest/100) * 2) + interest;
			
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}
}

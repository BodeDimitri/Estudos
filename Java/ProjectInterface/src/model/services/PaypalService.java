package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(double amount) { //((interest/100) * 2) + interest;
		return (amount/100) * 2;
	}

	@Override
	public Double interest(double amount, int months) { //((basicQuota/100) * i) + basicQuota;
		return ((amount/100) * months);
	}

}

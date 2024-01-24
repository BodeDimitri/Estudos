package application;

import java.util.Date;

import enteties.Order;
import enteties.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order.toString());
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //String para enum
		
		System.out.println(os1);
		System.out.println(os2);
	}

}

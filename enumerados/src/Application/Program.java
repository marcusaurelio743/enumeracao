package Application;



import java.util.Date;

import entities.Order;
import entities.enu.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080L, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}

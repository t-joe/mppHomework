package homework5.prob4;

import java.time.LocalDate;

final public class CustOrderFactory {
	private CustOrderFactory() {
	}

	private static int oNum = 1;

	public static Customer createCustomerOrderItem(String customerName, LocalDate oDate) {
		Customer c = new Customer(customerName);
		Order o = new Order(oNum, oDate);
		for (int i = 1; i <= 5; i++)
			o.addItem("Item" + oNum + "_" + i, 1000 * i);
		oNum++;
		c.getOrders().add(o);
		return c;
	}
}

package homework2.prob2b;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private static int orderNum = 0;
	private LocalDate orderDate;
	private List<OrderLine> olineList;
	public Order(LocalDate ldate)
	{
		orderNum++;
		this.orderDate = ldate;
		olineList = new ArrayList<OrderLine>();
	}
	public void addOrderLine(double price, int qty)
	{
		OrderLine ol = new OrderLine(this, price, qty);
		this.olineList.add(ol);
	}
	public List<OrderLine> getOrderLines()
	{
		return this.olineList;
	}
	public LocalDate getODate()
	{
		return orderDate;
	}
}

package homework5.prob4;

import java.util.ArrayList;
import java.util.List;

final public class Customer {
	private String name;
	private List<Order> orders;
	Customer(String name)
	{
		this.name = name;
		orders = new ArrayList<Order>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrders() {
		return orders;
	}
	@Override
	public String toString()
	{
		String str =  this.name + " total orders: " + orders.size();
		str += "\nOrders: \n\t";
		for(Order o: this.orders)
		{
			str += "Order number: "+ o.getOrderNo();
			str += "\n\t\tItems: ";
			for(Item i: o.getItems())
			{
				str += "\n\t\t\t" + i.getItemName();
			}
		}
		return str;
	}
}

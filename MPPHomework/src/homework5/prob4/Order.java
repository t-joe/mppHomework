package homework5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private List<Item> items;
	Order(int oNo, LocalDate oDate)
	{
		this.orderNo = oNo;
		this.orderDate = oDate;
		this.items = new ArrayList<Item>();
	}
	public void addItem(String itemName, double amount)
	{
		this.items.add(new Item(itemName, amount));
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}

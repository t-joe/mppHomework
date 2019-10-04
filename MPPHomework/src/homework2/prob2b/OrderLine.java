package homework2.prob2b;

public class OrderLine {
	private static int lineNum = 0;
	private double price;
	private int quantity;
	private Order order;
	public OrderLine(Order order, double price, int qty)
	{
		lineNum++;
		this.price = price;
		this.quantity = qty;
		this.order = order;
	}
	public int getLineNum() {
		return lineNum;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}

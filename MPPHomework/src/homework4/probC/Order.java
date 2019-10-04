package homework4.probC;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmt;
	public Order(int oNo, LocalDate oDate, double oAmt)
	{
		this.orderNo = oNo;
		this.orderDate = oDate;
		this.orderAmt = oAmt;
	}
	public double getOrderAmt()
	{
		return orderAmt;
	}
	public LocalDate getOrderDate()
	{
		return orderDate;
	}
	public int getOrderNo()
	{
		return orderNo;
	}
}

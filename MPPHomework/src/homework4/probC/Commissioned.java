package homework4.probC;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(int empId, double baseSalary) {
		super(empId);
		this.orders = new ArrayList<Order>();
		this.baseSalary = baseSalary;
	}

	@Override
	public double calcGrossPay(int year, int month) {
		return baseSalary + (calcCommission(year, month) * commission / 100);
	}

	private double calcCommission(int year, int month) {
		double sum = 0;
		for (Order o : orders) {
			if (o.getOrderDate().getMonth().getValue() == month && o.getOrderDate().getYear() == year)
				sum += o.getOrderAmt();
		}
		return sum;
	}
	public void addOrder(Order o)
	{
		this.orders.add(o);
	}
}

package homework4.probC;

import java.time.LocalDate;

public abstract class Employee {
	private int empId;
	public void print() {
		System.out.println(calcCompensation(LocalDate.now().getYear(), LocalDate.now().getMonthValue()));
	}
	public Employee(int EmpID)
	{
		this.empId = EmpID;
	}
	public Paycheck calcCompensation(int year, int month) {
		double grossPay = calcGrossPay(year, month);
		return new Paycheck(grossPay);
	}
	public abstract double calcGrossPay(int year, int month);
}

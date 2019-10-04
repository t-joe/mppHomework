package homework4.probC;

public class Salaried extends Employee{
	private double salary;
	public Salaried(int empId, double salary)
	{
		super(empId);
		this.salary = salary;
	}
	@Override
	public double calcGrossPay(int year, int month) {
		return this.salary;
	}
	
}

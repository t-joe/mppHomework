package homework4.probC;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	public Hourly(int empId, double hourlyWage, double hoursPerWeek)
	{
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public double calcGrossPay(int year, int month) {
		return hourlyWage * hoursPerWeek * 4;
	}
}

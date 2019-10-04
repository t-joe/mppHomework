package homework4.probC;

public final class Paycheck {
	private double grossPay;
	private final static double fica = 23;
	private final static double state = 5;
	private final static double local = 1;
	private final static double medicare = 3;
	private final static double ssn = 7.5;

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSsn() {
		return ssn;
	}

	public double getFica() {
		return fica;
	}

	public void print() {
		System.out.println(this.toString());
	}

	public double getNetPay() {
		return (this.grossPay - (grossPay * fica / 100) - (grossPay * state / 100) - (grossPay * local / 100)
				- (grossPay * medicare / 100) - (grossPay * ssn / 100));
	}
	@Override
	public String toString()
	{
		return "Paystub: \n "
				+ "  Gross Pay: " + grossPay + "\n"
				+ "  Fica: " + fica  + "\n" 
				+ "  State: " + state  + "\n" 
				+ "  Local: " + local  + "\n" 
				+ "  Medicare: " + medicare  + "\n" 
				+ "  Social Security: " + ssn  + "\n" 
				+ "  NET PAY: " + getNetPay();
	}
}

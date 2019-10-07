package homework5.prob2;

public final class Traingle implements Figure{

	private final double base;
	private final double height;
	public Traingle(double height, double base)
	{
		this.base = base;
		this.height = height;
	}
	@Override
	public double computeArea() {
		return base * height / 2;
	}

}

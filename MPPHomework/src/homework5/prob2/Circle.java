package homework5.prob2;

public final class Circle implements Figure{

	private final double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	public double computeArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	public double getRadius()
	{
		return this.radius;
	}
}

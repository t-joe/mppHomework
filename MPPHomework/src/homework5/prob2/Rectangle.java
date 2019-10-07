package homework5.prob2;

public final class Rectangle implements Figure{
	private final double width;
	private final double height;
	public Rectangle(double height, double width)
	{
		this.height = height;
		this.width=width;
	}
	@Override
	public double computeArea() {
		return this.height * this.width;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}

}

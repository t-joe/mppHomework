package homework7.prob2;

public interface Polygon extends ClosedCurve{
	public double[] getSides();
	default double computePerimeter()
	{
		return 0;
	}
}

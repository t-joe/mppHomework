package homework7.prob2;

public class EquilateralTriangle implements Polygon {
	double side;

	public EquilateralTriangle(double side)
	{
		this.side = side;
	}
	@Override
	public double[] getSides() {
		return new double[] { side };
	}
	
	public double computePerimeter()
	{
		double r =side * 3; 
		return r;
	}
}

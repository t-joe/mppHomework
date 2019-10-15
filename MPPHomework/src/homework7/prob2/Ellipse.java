package homework7.prob2;

public class Ellipse implements Polygon {

	double a, E;

	public Ellipse(double a, double e)
	{
		this.a = a;
		this.E = e;
	}
	@Override
	public double[] getSides() {
		return new double[] { a, E };
	}

	public double computePerimeter() {
		return 4 * a * E;
	}
}

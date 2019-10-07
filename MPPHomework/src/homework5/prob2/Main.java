package homework5.prob2;

public class Main {

	public static void main(String[] args) {
		Figure[] figs = {new Circle(15.0), new Rectangle(20, 150), new Traingle(15, 10), new Rectangle(30, 100), new Circle(22)};
		double sum = 0;
		for(Figure f: figs)
		{
			sum += f.computeArea();
		}
		System.out.println("Total area: " + sum);
	}

}

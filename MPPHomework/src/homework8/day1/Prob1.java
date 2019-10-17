package homework8.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Prob1 {
	public static void main(String[] args)
	{
		BiFunction<Double, Double, List<Double>> func = (x, y) -> {
			List<Double> l = new ArrayList<Double>();
			l.add(Math.pow(x, y));
			l.add(x*y);
			return l;
		};
		
		func.apply(10.0, 3.0).forEach(System.out::println);
	}
}

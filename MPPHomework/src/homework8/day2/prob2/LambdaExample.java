package homework8.day2.prob2;

import java.util.function.Supplier;

public class LambdaExample {
	public static void main(String[] args)
	{
		Supplier<Double> func = () -> Math.random();
		System.out.println(func.get());
	}
}

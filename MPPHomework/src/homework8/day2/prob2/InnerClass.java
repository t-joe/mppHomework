package homework8.day2.prob2;

import java.util.function.Supplier;

public class InnerClass {
	public static void main(String[] str)
	{	
		InnerClass ic = new InnerClass();
		System.out.println(ic.new InnerIclass().get());
	}
	class InnerIclass implements Supplier<Double>
	{
		@Override
		public Double get()
		{
			return Math.random();
		}
	}
}

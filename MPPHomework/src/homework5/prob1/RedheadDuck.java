package homework5.prob1;

public class RedheadDuck extends Duck{
	public RedheadDuck(FlyBehavior fly, QuackBehavior quack)
	{
		super(fly, quack);
	}
	public RedheadDuck()
	{
		this(new FlyWithWings(), new Quack());
	}
	@Override
	public void display()
	{
		System.out.println("Displaying redhead duck");
	}
}

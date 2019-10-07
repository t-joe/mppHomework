package homework5.prob1;

public class MallardDuck extends Duck{
	public MallardDuck(FlyBehavior fly, QuackBehavior quack) {
		super(fly, quack);
	}
	public MallardDuck()
	{
		this(new FlyWithWings(), new Quack());
	}

	@Override
	public void display()
	{
		System.out.println("Mallard display");
	}
}

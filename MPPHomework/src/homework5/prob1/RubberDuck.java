package homework5.prob1;

public class RubberDuck extends Duck{

	public RubberDuck(FlyBehavior fly, QuackBehavior quack) {
		super(fly, quack);
	}
	public RubberDuck()
	{
		this(new CannotFly(), new Squeak());
	}

	@Override
	public void display() {
		System.out.println("Displaying rubber duck");
	}
	
}

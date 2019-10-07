package homework5.prob1;

public class DecoyDuck extends Duck{

	public DecoyDuck(FlyBehavior fly, QuackBehavior quack) {
		super(fly, quack);
		// TODO Auto-generated constructor stub
	}
	public DecoyDuck()
	{
		this(new CannotFly(), new MuteQuack());
	}
	@Override
	public void display() {
		System.out.println("Displaying decoy duck");
		
	}

}

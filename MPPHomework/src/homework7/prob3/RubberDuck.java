package homework7.prob3;

public class RubberDuck extends Duck{

	@Override
	public void display() {
		System.out.println("Rubber duck");
	}
	@Override
	public void fly()
	{
		System.out.println("Cannot fly");
	}
	@Override
	public void quack()
	{
		System.out.println("Squick");
	}
}

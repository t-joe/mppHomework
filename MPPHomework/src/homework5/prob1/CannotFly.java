package homework5.prob1;

public class CannotFly implements FlyBehavior{
	@Override 
	public void fly()
	{
		System.out.println("Can not fly");
	}
}

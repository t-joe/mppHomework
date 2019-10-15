package homework7.prob3;

public class DecoyDuck extends Duck
{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Decoy duck");
	}
	@Override
	public void fly()
	{
		System.out.println("Cannot fly");
	}
	@Override
	public void quack()
	{
		System.out.println("Mute");
	}
	
}
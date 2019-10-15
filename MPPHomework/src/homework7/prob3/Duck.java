package homework7.prob3;

public abstract class Duck implements Flyable, Quackable {
	public void swim()
	{
		System.out.println("Swimming");
	}
	public abstract void display();
}

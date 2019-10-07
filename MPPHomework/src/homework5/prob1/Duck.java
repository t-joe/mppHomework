package homework5.prob1;

public abstract class Duck {
	private FlyBehavior fly;
	private QuackBehavior quack;
	public Duck(FlyBehavior fly, QuackBehavior quack)
	{
		this.fly = fly;
		this.quack = quack;
	}
	public void swim()
	{
		System.out.println("Swimming");
	}
	public abstract void display();
	public FlyBehavior getFlyBehavior()
	{
		return this.fly;
	}
	public QuackBehavior getQuackBehavior()
	{
		return this.quack;
	}
}

package homework7.prob3;

public interface Quackable {
	default public void quack()
	{
		System.out.println("Quack");
	}
}

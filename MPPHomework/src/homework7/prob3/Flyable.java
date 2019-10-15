package homework7.prob3;

public interface Flyable {
	default public void fly()
	{
		System.out.println("Fly with wings");
	}
}

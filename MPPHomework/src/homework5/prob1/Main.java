package homework5.prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()}; 
		for(Duck d: ducks)
		{
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.getFlyBehavior().fly();
			d.getQuackBehavior().quack();
			d.swim();
			System.out.println();
		}
	}

}

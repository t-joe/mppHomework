package homework8.day1.prob2.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import homework8.day1.prob2.ab.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Lenevo", 100.0, 2));
		list.add(new Product("Lenevo", 200.0, 1));
		list.add(new Product("Sony", 100.0, 3));
		list.add(new Product("Samsung", 300.3, 3));
		list.add(new Product("Samsung", 500.0, 1));
		list.add(new Product("Dell", 350.0, 1));
		list.add(new Product("Dell", 700.0, 3));
		list.add(new Product("Dell", 50.0, 2));

		Collections.sort(list,
				(x, y) -> x.getTitle().compareTo(y.getTitle()) == 0 ? Double.compare(x.getModel(), y.getModel())
						: x.getTitle().compareTo(y.getTitle()));
		
		list.forEach(System.out::println);
	}

}

package homework8.day1.prob2.ab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("Lenevo", 100.0, 2));
		list.add(new Product("Lenevo", 200.0, 1));
		list.add(new Product("Sony", 100.0, 3));
		list.add(new Product("Samsung", 300.3, 3));
		list.add(new Product("Samsung", 500.0,1));
		list.add(new Product("Dell", 350.0, 1));
		list.add(new Product("Dell", 700.0, 3));
		list.add(new Product("Dell", 50.0, 2));
		
		Collections.sort(list, new PriceComparator());
		list.forEach(System.out::println);
		System.out.println("************* by title ****************");
		Collections.sort(list, new TitleComparator());
		list.forEach(System.out::println);
	}
}

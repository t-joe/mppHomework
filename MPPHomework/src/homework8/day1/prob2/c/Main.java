package homework8.day1.prob2.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import homework8.day1.prob2.ab.Product;

public class Main {
	static enum SortMethod {
		BYNAME, BYSALARY
	}

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

		sort(list, SortMethod.BYNAME).forEach(System.out::println);
		System.out.println("**************** by salary *********************");
		sort(list, SortMethod.BYSALARY).forEach(System.out::println);
	}

	private static List<Product> sort(List<Product> p, SortMethod sm) {
		class CompareProduct implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				switch (sm) {
				case BYNAME:
					return p1.getTitle().compareTo(p2.getTitle());
				default:
					return Double.compare(p1.getPrice(), p2.getPrice());
				}
			}
		}
		Collections.sort(p, new CompareProduct());
		return p;
	}
}

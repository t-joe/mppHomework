package homework9.prob7a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
		          new Employee("John", "Sims", 110000),
		          new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

		System.out.print(list.stream().filter(x->x.getSalary() > 100000 && String.valueOf(x.getLastName().charAt(0)).matches("[N-Zn-z]"))
		.map(x->x.getFirstName() + " "+ x.getLastName())
		.sorted(Comparator.comparing(x->x)).collect(Collectors.joining(", ")));
	}

}

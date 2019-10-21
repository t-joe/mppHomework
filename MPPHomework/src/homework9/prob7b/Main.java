package homework9.prob7b;

import java.util.Arrays;
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
		
		List<String> filteredList = LambdaLibrary.EMP_LIST.apply(list, 100000, "[N-Zn-z]")
		.stream().map(LambdaLibrary.EMP_FULL_NAME)
		.sorted(String::compareTo)
		.collect(Collectors.toList());
		
		System.out.println(filteredList);
	}

}

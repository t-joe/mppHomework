package homework9.prob7b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.*;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer,String, List<Employee>> EMP_LIST	
	= (list, salary, initials)
	-> list.stream()
	.filter(emp-> emp.getSalary() > salary)
	.filter(emp-> String.valueOf(emp.getLastName().charAt(0)).matches(initials))
	.collect(Collectors.toList());
	
	public static final Function<Employee, String> EMP_FULL_NAME
	= (emp)
	-> emp.getFirstName() + " " + emp.getLastName();
}

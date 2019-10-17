package homework8.day2;

import java.util.Arrays;
import java.util.List;

public class Prob3 {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		fruits.forEach(x -> System.out.println(x));
		System.out.println("********** ************ ************");
		fruits.forEach(System.out::println);
	}
}

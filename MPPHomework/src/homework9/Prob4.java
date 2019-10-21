package homework9;

import java.util.function.Function;
import java.util.stream.*;

public class Prob4 {
	public static void main(String[] args) {
		printSquares(4);
	}

	public static void printSquares(int num) {
		Function<Integer, Integer> f = x -> x * x;
		Stream.iterate(1, x -> x + 1).limit(num).map(f).forEach(System.out::println);
	}
}

package homework9;

import java.util.Arrays;
import java.util.stream.Stream;

public class Prob5 {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n - m);
	}

	public static void main(String[] args) {
		streamSection(nextStream(), 3, 7).forEach(System.out::println);
		System.out.println("");
		streamSection(nextStream(), 1, 4).forEach(System.out::println);
		System.out.println("");
		streamSection(nextStream(), 5, 8).forEach(System.out::println);
	}

	// support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}
}

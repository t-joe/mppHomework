package homework9;
import java.util.stream.*;

public class Prob1 {
	public static void main(String[] args)
	{
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.joining(", ")));
	}
}

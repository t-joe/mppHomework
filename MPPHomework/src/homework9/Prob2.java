package homework9;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob2 {
public static void main(String[] args)
{
	Stream<Integer> myIntStream = Stream.of(1, 3, 10, -10, 23, 10, 0, 130);
	IntSummaryStatistics iss = myIntStream.collect(Collectors.summarizingInt(x->x));
	System.out.println("Max :"+iss.getMax()+", Min :"+ iss.getMin()	);
}
}

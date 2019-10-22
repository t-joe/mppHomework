package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Prob2 {

	public static void main(String[] args) {
		List<String> strlist = Arrays.asList("Java", "C++", "Portran", "C#", "Python", "Php");
		System.out.println(secondSmallest(strlist));
		System.out.println("****************************************");
		List<Integer> ilist = Arrays.asList(1, 5, 3, 10, 7, 22, 0, -10, 30);
		System.out.println(secondSmallest(ilist));
		System.out.println("****************************************");
		List<Double> dlist = Arrays.asList(1.0, 5.23, 3.2, 10.1, 7.2, 22.0, 0.2, -10.25, 30.6);
		System.out.println(secondSmallest(dlist));
	}
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list)
	{
		if(list.size() <= 1) return null;
		return list.stream().sorted((x, y) -> x.compareTo(y)).collect(Collectors.toList()).get(1);
	}

}

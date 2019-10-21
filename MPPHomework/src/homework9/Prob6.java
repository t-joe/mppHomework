package homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 p = new Prob6();
		Set<String> str = new HashSet<String>();
		List<Set<String>> sets = new ArrayList<Set<String>>();
		str.add("A");
		str.add("B");
		sets.add(str);
		str = new HashSet<String>();
		str.add("D");		
		sets.add(str);
		str = new HashSet<String>();
		str.add("1");
		str.add("2");
		str.add("5");
		sets.add(str);
		p.union(sets).forEach(System.out::println);
	}
	
	public Set<String> union(List<Set<String>> sets) {
		//return sets.stream().flatMap(x -> x.stream()).collect(Collectors.toSet());
		return sets.stream().reduce(new HashSet<String>(), (x, y) -> {x.addAll(y); return x;});
	}
}

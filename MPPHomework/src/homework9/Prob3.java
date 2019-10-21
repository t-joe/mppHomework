package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("hello", "there", "are", "you", "going", "to", "los angelos", "apple", "banana", "curd", "deer"));
		Prob3 p = new Prob3();
		System.out.println(p.countWords(list, 'o', 'n', 5));
	}
	
	public int countWords(List<String> words, char c, char d, int len)
	{
		return (int)words.stream().filter(x-> x.length() == len && x.contains(String.valueOf(c)) && !x.contains(String.valueOf(d))).count()	;
	}
}

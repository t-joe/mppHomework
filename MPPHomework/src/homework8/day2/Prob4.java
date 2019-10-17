package homework8.day2;

import java.util.Arrays;

public class Prob4 {
	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };		
		Arrays.sort(names, String::compareToIgnoreCase);
		for(String s: names)
			System.out.println(s);
	}
}

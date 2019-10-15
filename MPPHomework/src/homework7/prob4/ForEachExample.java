package homework7.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon","Away", "On Vacation", "Everywhere you want to be");
		
		ForEachExample ex = new ForEachExample();
		list.forEach(ex.cs);
		System.out.println("\n\n*************************************************\n\n");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String s)
			{
				System.out.println(s.toUpperCase());
			}
		});
	}
	
	Consumer<String> cs = new Consumer<String>() {
		@Override
		public void accept(String s)
		{
			System.out.println(s.toUpperCase());
		}
	};
	
}

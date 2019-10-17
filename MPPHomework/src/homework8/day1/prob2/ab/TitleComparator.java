package homework8.day1.prob2.ab;

import java.util.Comparator;

public class TitleComparator implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2)
	{
		return p1.getTitle().compareTo(p2.getTitle());
	}
}

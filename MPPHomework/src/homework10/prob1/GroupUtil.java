package homework10.prob1;

import java.util.Arrays;
import java.util.List;

public class GroupUtil {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println("Copy: \n"+GroupUtil.copy(group));
		System.out.println("****************************************");
		List<Integer> ilist = Arrays.asList(4,8,5,6,0);
		Group<Integer> igroup = new Group<>(8, ilist);
		System.out.println(igroup);
		System.out.println("Copy: \n"+GroupUtil.copy(igroup));
		System.out.println("****************************************");
		List<String> slist = Arrays.asList("Hello", "This", "is", "java");
		Group<String>  grp = new Group<>("Java", slist);
		System.out.println(grp);
		System.out.println("Copy: \n"+GroupUtil.copy(grp));
	}
	public static <T> Group<T> copy(Group<T> group)
	{
		List<T> elements  = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}
}

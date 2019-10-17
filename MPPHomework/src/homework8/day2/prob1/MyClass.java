package homework8.day2.prob1;

import java.util.function.Function;

public class MyClass {
	String name;
	int age;
	public MyClass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj == null) return false;
		if(!(obj instanceof MyClass)) return false;
		MyClass mc = (MyClass)obj;
		if(name.equals(mc.name) && age == mc.age) return true;
		return false;
	}
	
	boolean myMethod(MyClass mc)
	{
		Function<MyClass, Boolean> myMethod = this::equals;
		return myMethod.apply(mc);
	}
	public static void main(String[] args)
	{
		MyClass mc = new MyClass("Joe", 21);
		MyClass mc1 = new MyClass("Joe", 21);
		MyClass mc2 = new MyClass("Bold", 22);
		
		System.out.println(mc.myMethod(mc1));
		System.out.println(mc1.myMethod(mc2));
	}
}

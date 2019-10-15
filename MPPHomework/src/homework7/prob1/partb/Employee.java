package homework7.prob1.partb;

import java.util.Objects;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	public boolean equals(Object e1) {
		if(!(e1 instanceof Employee))return false;
		Employee e = (Employee)e1;
		boolean result = e.name.equals(name) && e.salary == salary;
		return result;
	}
}

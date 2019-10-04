package homework2.prob2a;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student("Tuugii");
		stu.getGrade().setGrade("Perfect");		
		System.out.println(stu.getName() + ": "+ stu.getGrade().getGrade());
	}

}

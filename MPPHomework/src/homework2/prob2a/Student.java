package homework2.prob2a;

public class Student {
	private String Name;
	private GradeReport gradeReport = null;
	public Student(String name)
	{
		this.Name = name;
		gradeReport = new GradeReport(this);
	}
	public String getName()
	{
		return this.Name;
	}
	public GradeReport getGrade()
	{
		return this.gradeReport;
	}
	@Override
	public String toString()
	{
		return this.Name;
	}
}

package homework2.prob2a;

public class GradeReport {
	private Student student;
	private String grade;
	public GradeReport(Student stu)
	{
		this.student = stu;
	}
	public Student getStudent()
	{
		return student;
	}
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	public String getGrade()
	{
		return grade;
	}
	@Override
	public String toString()
	{
		return this.student.getName() + ": " + this.grade;
	}
}

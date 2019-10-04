package homework2.prob4;

import java.util.ArrayList;

public class StudentSectionFactory {

	public Section createSection(int secNum, String courseName)
	{
		Section sec = new Section();
		sec.sectionNumber = secNum;
		sec.courseName = courseName;
		sec.gradeSheet = new ArrayList<TranscriptEntry>();
		return sec;
	}
	public Student createStudent(String id, String name)
	{
		Student stu = new Student();
		stu.name = name;
		stu.grades = new ArrayList<TranscriptEntry>();
		return stu;
	}
	public void newTranscriptEntry(Student s, Section sect, String grade)
	{
		TranscriptEntry entry = new TranscriptEntry();
		entry.student = s;
		entry.section = sect;
		entry.grade = grade;
		s.grades.add(entry);
		sect.gradeSheet.add(entry);
	}
}

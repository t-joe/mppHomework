package homework2.prob4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	List<Student> sList = new ArrayList<Student>();
	public static void main(String[] args) { 
		StudentSectionFactory ssf = new StudentSectionFactory();
		Student bob = ssf.createStudent("1", "bob");
		Student tim = ssf.createStudent("2", "Tim");
		Student allen = ssf.createStudent("3", "Allen");
		
		Section s1 = ssf.createSection(1, "math");
		Section s2 = ssf.createSection(2, "Computer");
		Section s3 = ssf.createSection(3, "Physics");
		
		ssf.newTranscriptEntry(bob, s1, "A");
		ssf.newTranscriptEntry(bob, s2, "A");
		ssf.newTranscriptEntry(bob, s3, "A");
		ssf.newTranscriptEntry(tim, s2, "A+");
		ssf.newTranscriptEntry(allen, s3, "B-");
		
		Main m = new Main();
		
		m.sList.add(bob);
		m.sList.add(tim);
		m.sList.add(allen);
		System.out.println(m.getTranscript(bob));
		System.out.println(m.getGrades(s2));
		System.out.println(m.getSections(bob));
		System.out.println(m.getStudentWith("A"));
	}
	
	private Transcript getTranscript(Student s) {
		return s.getTranscript();
	}
	private List<String> getGrades(Section s)
	{
		List<String> str = new ArrayList<String>();
		s.gradeSheet.forEach(e->{
			str.add(e.grade);
		});
		return str;
	}
	private List<String> getSections(Student s)
	{
		List<String> sect = new ArrayList<String>();
		for(TranscriptEntry ts: s.grades)
		{
			sect.add(ts.section.courseName);
		}
		return sect;
	}
	private List<String> getStudentWith(String grade)
	{
		List<String> str = new ArrayList<String>();
		boolean allA = true;
		for(Student s: sList)
		{
			allA = true;
			for(TranscriptEntry te: s.grades)
			{
				if(!te.grade.startsWith(grade))
				{
					allA = false;
					break;
				}
			}
			if(allA)
				str.add(s.name);
		}
		return str;
	}
}
	
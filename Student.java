package Week3.Day1.assignment;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name is Priya");
	}
	public void studentDept()
	{
		System.out.println("Student Department is Mathematics");
	}
	public void studentId()
	{
		System.out.println("Student ID is 34555");
	}

	public static void main(String[] args) {
		Student myStudent= new Student();
		myStudent.collegeName();
		myStudent.collegeCode();
		myStudent.collegeRank();
		myStudent.deptName();
		myStudent.studentName();
		myStudent.studentId();
		myStudent.studentDept();
		
	}
}

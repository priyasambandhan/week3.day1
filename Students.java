package Week3.Day1.assignment;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student Id is "+ id);
		
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student Id is "+ id);
		System.out.println("Student name is "+ name);
		
	}
	public void getStudentInfo(String email, long phone)
	{
		System.out.println("Student email is "+ email);
		System.out.println("Student Phone Number is "+ phone);
		
	}

	
	public static void main(String[] args) {
		
		Students mystudent= new Students();
		mystudent.getStudentInfo(1234);
		mystudent.getStudentInfo(1234, "Siddharth");
		mystudent.getStudentInfo("sid@gmail.com", 9876545689l);
		
	}
}

package Week3.Day1.assignment;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("The Desktop Size is 20 inches");
	}
	
	public static void main(String[] args) {
		
		Desktop mydesktop=new Desktop();
		mydesktop.computerModel();
		mydesktop.desktopSize();
		
	}
	
}

package Week3.Day1.assignment;

public class Automation extends MultipleLanguage implements TestTool {
	
	public void Java()
	{
		System.out.println("Java method from Language Interface is implemented");
	}
	
	public void Selenium()
	{
		System.out.println("Selenium method from TestTool Interface is implemented");
		
	}
	
	public void ruby()
	{
		System.out.println("abstract ruby method from Absract class MultipleLanguage is implemented");
	}
	
	public static void main(String[] args) {
		Automation aut= new Automation();
		aut.Java();
		aut.Selenium();
		aut.ruby();
		aut.python();
	}
}

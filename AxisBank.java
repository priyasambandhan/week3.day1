package Week3.Day1.assignment;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposit from AxisBank");
	}
	
	//Method overriding
	public static void main(String[] args) {
		AxisBank mybank= new AxisBank();
		mybank.saving();
		mybank.fixed();
		mybank.deposit();
	}

}

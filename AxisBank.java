package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		// TODO Auto-generated method stub
System.out.println("Override deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.savings();

	}

}


public class Inchild implements Test,Test2{
	

	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	public void deposit()
	{
		System.out.println("Test");

	}

	public void test4()
	{
		System.out.println("Test5");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inchild ref2=new Inchild();
		ref2.test4();
		ref2.deposit();
		ref2.withdraw();
	}

}

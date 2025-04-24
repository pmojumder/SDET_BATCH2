
public class Method_OverLoading {

	static int a=20;
	// Same Class,Method name will be same,Parameters will be different,We can call one method to another method by using this keyword)
	public void test(int a)
	{
		System.out.println("INT");
	}
	
	public void test(double a)
	{
		System.out.println("double");
		this.test(20);


	}
	
	public void test(String str)
	{
		System.out.println("String");
		this.test(20.20);


	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_OverLoading ref=new Method_OverLoading();
		ref.test("Plabnai");
	}

}

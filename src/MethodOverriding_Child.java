
public class MethodOverriding_Child extends MethodOverriding_Parent{

	public void Interestrate(String str)
	{
		System.out.println("11%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverriding_Child ref1=new MethodOverriding_Child();
		
			ref1.Interestrate(10.0f);
			ref1.Interestrate("HDFC");
		
	}

}

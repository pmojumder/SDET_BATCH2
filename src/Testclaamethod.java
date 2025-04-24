
public class Testclaamethod {
	
	public void hello(int a,int b)
	{
		this.hello("Plabani", 10);

		System.out.println("hello");
		
	}

	
	public void hello(String a,int b)
	{
		System.out.println("hello1");
		
	}
	
	public void hello(float a,int b)
	{
		this.hello(10, 10);
		System.out.println("hello2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testclaamethod obj=new Testclaamethod();
		obj.hello(0.0f, 10);
				
	}

}

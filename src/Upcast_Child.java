
public class Upcast_Child extends Upcast_Super {

	public void test1()
	{
		System.out.println("this is sub test");
	}
	
	public void hello()
	{
		System.out.println("this is hello test");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcast_Super ref  = new Upcast_Child();
		ref.test();
		ref.hello();
		//		Converting upcasted ref variable to subclass object,is called downcasting
		
		Upcast_Child ref1		=(Upcast_Child)ref;
		ref1.test();
		ref1.test1();
	} 

}


public class TestClass {

	TestClass() 
	{
		System.out.println("con");

		
	}
	
	TestClass(int a)
	{
		this();
		System.out.println("Int Con");

	}
	
	TestClass(String a)
	{
		this(10);
		System.out.println("String Con");

	}
	public static void test1()
	{
		System.out.println("test1");

	}
public void	test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) {
		TestClass  ref=new TestClass("plabani");
		ref.test();
		TestClass.test1();
		

	}

}

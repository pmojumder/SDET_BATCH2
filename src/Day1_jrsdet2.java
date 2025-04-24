
public class Day1_jrsdet2 {
	//Data Member
	//Function Member
	
	Day1_jrsdet2()
	{
		System.out.println("Default constructor");
	}
	
	Day1_jrsdet2(int a)
	{
		System.out.println("int constructor");
	}
	
	Day1_jrsdet2(String a)
	
	{
		this(10);
		System.out.println("String constructor");
	}
	static int a=10;
	public void test()
	{
		System.out.println ("test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Day1_jrsdet2.a);
		Day1_jrsdet2 ref1=new Day1_jrsdet2("Plabani");
		ref1.test();
		
	}

}

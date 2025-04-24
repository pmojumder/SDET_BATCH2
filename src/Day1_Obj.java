
public class Day1_Obj {
	
	//static int a;//Data Member
	
	Day1_Obj()
	{
		System.out.println("Default Constructor");
	}
	Day1_Obj(int a)
	{
		this(10.20);
		System.out.println("INT Constructor");
	}
	
	Day1_Obj(double a)
	{
		this();
		System.out.println("DOUBLE Constructor");
	}
	
	public void test() //Function member
	{
		System.out.println("test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //System.out.println(Day1_Obj.a);
		
		
         Day1_Obj  ref=new Day1_Obj(10); 
         
         
         ref.test();
	}

}

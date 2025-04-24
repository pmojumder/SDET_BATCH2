import java.util.HashSet;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		
		TreeSet<String> a1=new TreeSet<>();
		a1.add("java");
		a1.add("Automation");
		a1.add("Project");
		a1.add("java");

		int count=a1.size();
		System.out.println(count);
		
		for(String a2:a1)
		{
			System.out.println(a2);
		}
	}
}



public class ProgramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s = "Java";
s.concat(" World");
System.out.println(s); 

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Modifies the same object

        System.out.println("StringBuilder result: " + sb); // Output: Hello World
    }

	}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		Map<String, Integer> products = new HashMap<>();
		products.put("Laptop", 800);
		products.put("Phone", 600);
		products.put("Tablet", 300);

		List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(products.entrySet());
		sortedList.sort(Map.Entry.comparingByValue());

		for (Map.Entry<String, Integer> entry : sortedList) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}


	}*/
		
		String text = "Java is great and Java is powerful and Java is everywhere";

		String[] words = text.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
		    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		System.out.println("Word Frequency: " + wordCount);

	}
}


package example;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;

public class Example {
	
	public long scrabble() {
		String shakespearePath = "/shakespeare.txt";
		String scrabblePath = "/scrabble.txt";

		String[] expectedResult = {"120--QUICKLY" , "118--ZEPHYRS" , "114--QUALIFY-QUICKEN-QUICKER"};
		JavaScrabble scrabble  = new JavaScrabble(shakespearePath, scrabblePath);
		System.out.println("LLEGO");
	
		
		List<Entry<Integer, List<String>>> result  = scrabble.run();
		
		List<String> actualWords = JavaScrabble.prepareForValidation(result);
		
		System.out.println(actualWords);
		
		for (int i = 0; i < actualWords.size(); i++) {
			System.out.println("Word: " + actualWords.get(i));
		}
		
		
		for (int i = 0; i < actualWords.size(); i++) {
			if((actualWords.get(i).equals(expectedResult[i]))) {
				System.out.println("Word " + i + ": " + expectedResult[i] + " - Validated!");
			}
		}
		
		System.out.println("Program terminated.");

		return 1L;
	}
	
	public static void main(String args[]) {
		System.out.println("Example.main - executed");
	}
	
}



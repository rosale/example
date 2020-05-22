package example;
import java.util.stream.IntStream;

public class Example {
	
	public long count() {
	    String abc = "abc";
	      return abc.chars().count();
	}
	
	public long sum() {
		IntStream is =  IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return is.sum();
	}
	
	public static void main(String args[]) {
		System.out.println("Example.main - executed");
	}
	
}
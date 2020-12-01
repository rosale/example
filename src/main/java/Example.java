package example;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;

public class Example {
	
	public long count() {
	    String abc = "abc";
	      return abc.chars().count();
	}
	
	public long sum() {
		Thread t1 = new Thread(new MyRunnable(), "T1");
                t1.start();
		
		IntStream is =  IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return is.sum();
		
	}
	
	public static void main(String args[]) {
		System.out.println("Example.main - executed");
	}
	
}

class MyRunnable implements Runnable {
            @Override
            public void run() {
                    List<String> g = Arrays.asList("geeks", "for", "geeks", "Alpha", "newer", "geeks");
                    g.parallelStream().toArray();
            }
}

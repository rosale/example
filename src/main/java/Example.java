package example;

import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.function.ToLongFunction;
import java.util.stream.LongStream;
import java.util.stream.Stream;

//import org.junit.Assert;

public class Example {
	
	public long mnemonics() {
			MnemonicsCoderWithStream coder = new MnemonicsCoderWithStream(
			      java.util.Arrays.asList(
			        "Scala",
			        "rocks",
			        "Pack",
			        "brocks",
			        "GWT",
			        "implicit",
			        "nice",
			        "ScalaGWT",
			        "cat",
			        "EFPL",
			        "Lausanne",
			        "sCala",
			        "ROcks",
			        "pAck",
			        "Java",
			        "Apple",
			        "Google",
			        "Rochester",
			        "Utah",
			        "Rice",
			        "wyr",
			        "lxm",
			        "q",
			        "w",
			        "e",
			        "r",
			        "t",
			        "y",
			        "u",
			        "i",
			        "o",
			        "p",
			        "a",
			        "s",
			        "d",
			        "f"
			      ));
		
		
		Set<String> result = coder.parallelTranslate("72252762577225276257528249849874238824");
		
		//hashing("72b6f7d83bc807c0", result);
		
		System.out.println("Program terminated.");

		return 1L;
	}

/*
		 public static void hashing(String expected, Set<?> objects) {
	      assert expected != null;
	      assert objects != null;

	     
	        List<String> sorted = objects.stream()
	          .map(o -> Objects.toString(o, "null"))
	          .sorted().collect(toList());

	        hashing(expected, sorted);
	      
	    }
	
	  public static void hashing(String expected, List<?> objects) {
	      assert expected != null;
	      assert objects != null;

	     
	        LongBinaryOperator hashFunc = (l, r) -> l * 31 + r;

	        Function<LongStream, Long> streamHasher =
	          s -> s.reduce(hashFunc).orElse(0);

	        ToLongFunction<String> stringHasher =
	          s -> streamHasher.apply(s.chars().mapToLong(i -> i));

	        Function<List<?>, Stream<String>> asStrings =
	          l -> l.stream().map(o -> Objects.toString(o, "null"));

	        long hash = streamHasher.apply(asStrings.apply(objects).mapToLong(stringHasher));
	        String actual = String.format("%16x", hash);
	        Assert.assertEquals("object hash", expected, actual);
	      
	    }
	    */
	
	public static void main(String args[]) {
		System.out.println("Example.main - executed");
	}
	
}



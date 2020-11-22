package test;


import static org.junit.Assert.*;

import org.junit.*;
import java.util.Arrays;
import example.Example;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestExample {


	private Example example;


	@Before
	public void setup() {
		String abc8 = "abcdefghi";
	        abc8.chars().count();
		example = new Example();        
	}

	@Test
	public void testCount() throws Exception {
		assertEquals(example.count(), 3L);
	}

	@Test
	public void testSum() throws Exception {

        List<String> g = Arrays.asList("geeks", "for", "geeks", "Alpha", "newer", "geeks"); 
  
        Map<String, Long> result 
            = g.stream().collect( 
                Collectors.groupingBy( 
                    Function.identity(),
                    () -> new TreeMap<String, Long>(Comparator.reverseOrder()),
                    Collectors.counting())); 
		
		assertEquals(example.sum(), 55L);
	}

}

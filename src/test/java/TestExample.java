package test;


import static org.junit.Assert.*;

import org.junit.*;
import example.Example;

public class TestExample {


	private Example example;


	@Before
	public void setup() {
		example = new Example();        
	}

	@Test
	public void testCount() throws Exception {
		assertEquals(example.count(), 3L);
	}

	@Test
	public void testSum() throws Exception {
		String abc8 = "abcdefghi";
	        abc8.chars().count();
		assertEquals(example.sum(), 55L);
	}

}

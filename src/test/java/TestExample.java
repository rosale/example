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


	private Example example = new Example(); 


	@Test
	public void testMnemonics() throws Exception {
		assertEquals(example.mnemonics(), 1L);
	}
}

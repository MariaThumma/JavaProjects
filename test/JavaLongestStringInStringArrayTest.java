package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaLongestStringInStringArrayTest {

	String str= "The cow jumped over the moon";
	
	@Test
	public void testLongestWordLength() {
		String result="jumped";
		
	      assertEquals(result,JavaLongestStringInStringArray.LongestWord(str));
	}

	@Test
	public void testLongestWord() {
		int result=6;
		
	      assertEquals(result,JavaLongestStringInStringArray.LongestWordLength(str));
		
	}

	@Test
	public void testLongestWordNotEquals() {
		int result=7;
		
	      assertNotEquals(result,JavaLongestStringInStringArray.LongestWordLength(str));
		
	}
	
	@Test
	public void testLongestWordCaps() {
		String result="JUMPED";
		
	      assertNotEquals(result,JavaLongestStringInStringArray.LongestWord(str));
		
	}
	
	@Test
	public void testLongestWordWithSpace() {
		String result="JUMPED ";
		
	      assertNotEquals(result,JavaLongestStringInStringArray.LongestWord(str));
		
	}
}

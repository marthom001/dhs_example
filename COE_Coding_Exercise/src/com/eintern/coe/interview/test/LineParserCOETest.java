package com.eintern.coe.interview.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eintern.coe.interview.LineParserCOE;

public class LineParserCOETest {

	@Test
	public void testRetrieveSSN() {

		//Testing for correct SSNs and checking against incorrect entries
		String test1 = "0001112222";
		String test2 = "9991112222";
		String test3 = "xyz1112222";
		String test4 = "$&)1112222";
		
		assertEquals(test1, LineParserCOE.retrieveSSN(test1));
		assertNotEquals(test2, LineParserCOE.retrieveSSN(test2));
		assertNotEquals(test3, LineParserCOE.retrieveSSN(test3));
		assertNotEquals(test4, LineParserCOE.retrieveSSN(test4));		
		
	}
	


}

package edu.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import edu.wbl.main.General;

public class GeneralTest {
	
	General g = new General();
	
	@Test//(group="regression")
	public void testCase1_Add() {
		int actual = g.add(45,  56);
		int expected =   101;
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void testCase1_Reverse() {
		String actual= g.reverse("Java");
		String expected = "avaJ";
		Assert.assertTrue(actual.contains(expected));
		
	}

}

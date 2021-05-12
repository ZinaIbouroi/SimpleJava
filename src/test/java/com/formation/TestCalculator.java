package com.formation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	Calculator c=new Calculator();
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(2, c.add(1,1));
	}
	
	@Test
	public void testMultiply() {
		Assertions.assertEquals(1, c.multiply(1,1));
	}
	
	@Test
	public void testSubstraction() {
		Assertions.assertEquals(0, c.substraction(1,1));
	}

}

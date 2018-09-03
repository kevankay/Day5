package com.capgemini.day5.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;


class MyCalculatorTest {

	@Test
	void testPowerWithValidInput() throws Exception{
		assertEquals(243, MyCalculator.Power(3,5));
		assertEquals(16, MyCalculator.Power(2,4));
		assertEquals(32, MyCalculator.Power(2,5));
		
	}
    @Test
    void testPowerWithZeroinputs() {
    	Exception e;
		e = assertThrows(Exception.class,()->MyCalculator.Power(0,0));
		assertEquals("n and p should not be zero.",e.getMessage());
    }
    @Test
    void testPowerWithNegativeInputs() {
    	Exception e;
		e = assertThrows(Exception.class,()->MyCalculator.Power(-2,-5));
		assertEquals("n and p should not be negative.",e.getMessage());
		
		assertThrows(Exception.class,()->MyCalculator.Power(-2,5));
		assertEquals("n and p should not be negative.",e.getMessage());
		
		assertThrows(Exception.class,()->MyCalculator.Power(2,-5));
		assertEquals("n and p should not be negative.",e.getMessage());
    }
}



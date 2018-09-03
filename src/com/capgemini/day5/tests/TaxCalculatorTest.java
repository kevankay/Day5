package com.capgemini.day5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws Exception {
		assertEquals(3300.0,TaxCalculator.CalculateTax("Jack", true, 55000));
	}
	
	@Test
	void testCalculateTaxWithInvalidName() {
		Exception e;
		e = assertThrows(Exception.class,()->TaxCalculator.CalculateTax("null", true, 30000));
		assertEquals("Employee name cannot be empty.",e.getMessage());
		e = assertThrows(Exception.class,()->TaxCalculator.CalculateTax("", true, 30000));
		assertEquals("Employee name cannot be empty.",e.getMessage());
	}
	
	@Test
	void testCalculateTaxWithIneligible() {
		Exception e;
		e = assertThrows(Exception.class,()->TaxCalculator.CalculateTax("Tim", true, 1000));
		assertEquals("Employee does not need to pay tax.",e.getMessage());
	}
	
	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		e = assertThrows(Exception.class,()->TaxCalculator.CalculateTax("Ron", false, 34000));
		assertEquals("The employee should be an indian citizen for calculating tax.",e.getMessage());
	}
}

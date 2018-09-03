package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Student;

class StudentTest {
	
	@Test
	void testAgeNotInRange() throws Exception {
		Exception e;
		e = assertThrows(Exception.class,()->Student.details(83,"shiny",25,"btech"));
	     assertEquals("Age should be in range",e.getMessage());
	}
	
	@Test
	void testNameNotValid() {
		Exception e;
		e = assertThrows(Exception.class,()->Student.details(83,"shiny",25,"btech"));
	     assertEquals("Age should be in range",e.getMessage());
	}

}

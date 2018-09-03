package com.capgemini.day5;

public class Student {

	public static Object details(int rollNo, String studentName, int age, String course) throws Exception {
		if(age < 15 && age > 21) {
			throw new Exception("Age should be in range.");
		}
		
		return null;
	}

}

package com.capgemini.day5;

public interface Connection {
		
		void connect();
		void displayDatabaseInfo();
		
	default void print() {
			System.out.println("This is Connection interface");
		}
		
		public static void m2() {
			System.out.println("Inside m2() method");		
		}
	}



package com.capgemini.day5;

public class CalculatorMain {
	public static void main(String[] args) {
		// anonymous class
		
		/*Calculator add = new Calculator() {
			@Override
			public int calculate(int x, int y) {
				return x + y;
			}
		};*/
		
		Calculator add = (x, y) -> {
			System.out.println("Addition operation");
			return x + y;
		};
		
		/*Calculator sub = new Calculator() {			
			@Override
			public int calculate(int x, int y) {
				System.out.println("Subtraction operation");
				return x - y;
			}
		};*/
		
		Calculator sub = (x, y) -> {
			System.out.println("Subtraction operation");
			return x - y;
		};
		
		System.out.println(add.calculate(45, 78));
		System.out.println(sub.calculate(45, 12));
	}
}



package com.capgemini.day5.tests;

public class TaxCalculator {


	public static Object CalculateTax(String employeeName,boolean IsIndian,double employeeSalary) throws Exception {
		double Tax;
		if(IsIndian == true) {
			
			if(employeeSalary < 10000)
				throw new Exception("Employee does not need to pay tax.");
			else if(employeeSalary >= 100000)
			    Tax = employeeSalary*8/100;
		    else if(employeeSalary >= 50000 && employeeSalary < 100000)
		        return Tax = employeeSalary*6/100;
		    else if(employeeSalary >= 30000 && employeeSalary < 50000)
		        Tax = employeeSalary*5/100;
		    else if(employeeSalary >= 10000 && employeeSalary < 30000);
		        Tax = employeeSalary*4/100;
		    }
		else
			throw new Exception("The employee should be an indian citizen for calculating tax.");
		
		if(employeeName == "" || employeeName == "null")
			throw new Exception("Employee name cannot be empty.");
		return null;
		
	    }
}

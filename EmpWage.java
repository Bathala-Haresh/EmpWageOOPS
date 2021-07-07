package com.java.problems;

public class EmployeeWageUc2 {

	final int fullTime = 1;
	public int getFullTime() {
		return fullTime;
	}
	public int getWageHr() {
		return wageHr;
	}
	final int wageHr = 20;

	void method()
	{
		int empType = (int) (Math.random() * 100) % 2;
		int workingHours = 0;

		//If condition to check employee is present or absent
		if (empType == fullTime)
		{
			System.out.println("Employee is Present so ...");
			workingHours = 8;
		} else
		{
			System.out.println("Employee is Absent so ...");
		}
		//calculating the wage
		int wage = workingHours * wageHr;
		System.out.println("Employee Daily Wage is " + wage);
	}

}



public class EmpWage
{
	public static void main(String args[])
	{
		
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc2 emp2=new EmployeeWageUc2();
		emp2.method();
		
		
		
		
	}
}
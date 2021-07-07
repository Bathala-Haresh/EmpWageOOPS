package com.java.problems;

public class EmployeeWageUc3 {
	final int fullTime = 1;
	final int partTime = 2;
	final int wageHr = 20;
	public int getFullTime() {
		return fullTime;
	}
	public int getPartTime() {
		return partTime;
	}
	public int getWageHr() {
		return wageHr;
	}


	void method()
	{
		int empType = (int) (Math.random() * 100) % 3;
		int workingHours = 0;


		if (empType == fullTime)
		{
			System.out.println("Employee is Present so ");
			workingHours = 8;
		} 
		else if (empType == partTime) 
		{
			System.out.println("Employee has present PartTime so ");
			workingHours = 4;
		}else
		{
			System.out.println("Employee is Absent so ");
		}
		//calculate the wage of an employee
		int wage = workingHours * wageHr;
		System.out.println("Employee Daily Wage is " + wage);
	}
}



public class EmpWage
{
	public static void main(String args[])
	{
		
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc3 emp3=new EmployeeWageUc3();
		emp3.method();
		
		
		
	}
}
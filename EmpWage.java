package com.java.problems;

public class EmployeeWageUc4 {
	final int partTime = 1;
	final int fullTime = 2;
	final int wageHr = 20;
	public int getPartTime() {
		return partTime;
	}
	public int getFullTime() {
		return fullTime;
	}
	public int getWageHr() {
		return wageHr;
	}

	
	void method()
	{
		int workingHours =0;
		int empType = (int) (Math.random() * 100) % 3;
		
		
		//switch case to find employee Present or absent or worked partTime
		switch (empType)
		{
		case fullTime:
			System.out.println("Employee is Present Full time");
			workingHours = 8;
			break;
		case partTime:
			System.out.println("Employee is Present Part time");
			workingHours = 4;
			break;
		default:
			System.out.println("Employee is Absent");  
		}
		//calculating wage of an employee
		int wage = workingHours * wageHr;
		System.out.println("Employee Daily Wage is " + wage);

	}
}





public class EmpWage
{
	public static void main(String args[])
	{
		System.out.println("--------------------------------------------------");
		EmployeeWageUc4 emp4=new EmployeeWageUc4();
		emp4.method();
		
		
		
	}
}
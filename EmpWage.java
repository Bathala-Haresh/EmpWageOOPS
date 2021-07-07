package com.java.problems;

public class EmployeeWageUc5
{

	final int partTime = 1;
	final int fullTime = 2;
	final int wageHr = 20;
	final int workingDays = 20;

	public int getPartTime() {
		return partTime;
	}
	public int getFullTime() {
		return fullTime;
	}
	public int getWageHr() {
		return wageHr;
	}
	public int getWorkingDays() {
		return workingDays;
	}


	void method()
	{

		int totalWage=0;
		int empType = (int) (Math.random() * 100) % 3;
		//loop that travels for day starting from 1 to 20 th day and calculating total wage
		for (int day = 1; day <= workingDays; day++)
		{
			int workingHours =0;
			switch (empType)
			{
			case fullTime:
				workingHours = 8;
				break;
			case partTime:
				workingHours = 4;
				break;
			default:
			}
			int wage = workingHours * wageHr;
			System.out.println("Day " + day + " wage is:" + wage);
			totalWage += wage;
		}
		//prints the total wage for the month
		System.out.println("Total wage for a month is " + totalWage);        
	}
}




public class EmpWage
{
	public static void main(String args[])
	{
		EmployeeWageUc5 emp5=new EmployeeWageUc5();
		emp5.method();	
		
	}
}



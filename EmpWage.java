package com.java.problems;

public class EmployeeWage1 {

	void method()
	{
		System.out.println("Attendence Checking ....");

		//Random function to get either 1 or 0
		int employee=(int)(Math.random() * 100) % 2;

		if(employee == 1)
		{
			System.out.print("present");
		}
		else{
			System.out.print("absent");
		}
	}

}



public class EmpWage
{
	public static void main(String args[])
	{

		EmployeeWage1 emp1=new EmployeeWage1();
		emp1.method();
		
		
		
	}
}
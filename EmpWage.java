
package com.java.problems;
public class EmpWage
{
	public static void main(String args[])
	{
		EmployeeWageUc5 emp5=new EmployeeWageUc5();
		emp5.method5();
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc4 emp4=new EmployeeWageUc4();
		emp4.method4();
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc6 emp6=new EmployeeWageUc6();
		emp6.method6();
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc3 emp3=new EmployeeWageUc3();
		emp3.method3();
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc2 emp2=new EmployeeWageUc2();
		emp2.method2();
		
		System.out.println("--------------------------------------------------");
		EmployeeWage1 emp1=new EmployeeWage1();
		emp1.method1();
		
		
		
	}
}




//USECASE1 
public class EmployeeWage1 {

	void method1()
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

//USECASE2 
public class EmployeeWageUc2 {

	final int fullTime = 1;
	public int getFullTime() {
		return fullTime;
	}
	public int getWageHr() {
		return wageHr;
	}
	final int wageHr = 20;

	void method2()
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

//USECASE3
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


	void method3()
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

//USECASE4
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

	
	void method4()
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

//USECASE5
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


	void method5()
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

//USECASE6
package com.java.problems;

public class EmployeeWageUc6 {

	final int partTime = 1;
	final int fullTime = 2;
	final int wageHr = 20;
	final int workingDays = 20;
	final int Max_Working_Days = 20;
	public int getMax_Working_Days() {
		return Max_Working_Days;
	}
	public int getMax_Working_Hrs() {
		return Max_Working_Hrs;
	}

	final int Max_Working_Hrs = 100;a

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

	void method6()
	{
		int totalWage = 0;
		int workingHrs = 0;
		System.out.printf("%3s     %3s       %3s       %3s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

		//for loop to check a condition working hours or days is reached maximum
		for (int day = 1, totalWorkingHrs = 0; day <= Max_Working_Days
				&& totalWorkingHrs < Max_Working_Hrs; day++, totalWorkingHrs += workingHrs)
		{

			int empType = (int) (Math.random() * 100) % 3;
			switch (empType)
			{
			case fullTime:
				workingHrs = 8;
				break;
			case  partTime:
				workingHrs = 4;
				break;
			default:
				workingHrs = 0;
				break;
			}
			//calculating totalwage for an employee
			int wage = workingHrs * wageHr;
			totalWage += wage;

			//prints day ,workinghours,wage,totalhours and workinghours of an employee
			System.out.printf("%3d          %3d          %3d          %3d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

		}
		System.out.println("Total wage for the entire month is " + totalWage);
	}
}









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

	final int Max_Working_Hrs = 100;

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







public class EmpWage
{
	public static void main(String args[])
	{
		
		
		System.out.println("--------------------------------------------------");
		EmployeeWageUc6 emp6=new EmployeeWageUc6();
		emp6.method();
		
	}
}
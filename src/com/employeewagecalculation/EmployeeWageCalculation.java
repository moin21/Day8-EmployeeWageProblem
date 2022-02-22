package com.employeewagecalculation;

import java.util.Random;

public class EmployeeWageCalculation {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;

	/*
	 * Constructor with parameters required to calculate employee wage
	 */
	public EmployeeWageCalculation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	/*
	 * Method to calculate employee wage
	 */
	public void totalEmpWage() {
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {

			case IS_PART_TIME -> empHrs = 4;

			case IS_FULL_TIME -> empHrs = 8;

			default -> empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * empRatePerHour;
			System.out.println("day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("salary of " + company + " employee is " + totalEmpWage);

	}

	public static void main(String[] args) {
		EmployeeWageCalculation dMart = new EmployeeWageCalculation("dmart", 20, 20, 100); // Object
		dMart.totalEmpWage();// calling method
		EmployeeWageCalculation wipro = new EmployeeWageCalculation("wipro", 25, 15, 100); // Object
		wipro.totalEmpWage();// calling method
	}

}

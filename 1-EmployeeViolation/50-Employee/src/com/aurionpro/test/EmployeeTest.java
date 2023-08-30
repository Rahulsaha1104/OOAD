package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "rahul", 800000);
		double totalSalary = employee.calculateTotalSalary();
		employee.printSalarySlip(totalSalary);
		// System.out.println("Total Salary: " + totalSalary);// System.out.println();
	}
}

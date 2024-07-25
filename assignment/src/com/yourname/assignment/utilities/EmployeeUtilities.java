package com.yourname.assignment.utilities;

import com.yourname.assignment.employees.*;

public class EmployeeUtilities{
	
	public void display(Employee emp) {
		System.out.println("Employee id : "+emp.getEmp_id());
		System.out.println("Employee name : "+emp.getName());
		System.out.println("Employee Salary : "+emp.getSalary());
	}
}
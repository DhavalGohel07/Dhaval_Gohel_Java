package com.yourname.assignment.employees;

public class Employee {
	private String name;
	private double salary;
	private int emp_id;
	public Employee(String name, double salary, int emp_id) {
		super();
		this.name = name;
		this.salary = salary;
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", emp_id=" + emp_id + "]";
	}
}

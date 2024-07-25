package com.yourname.assignment.employees;

public class Manager extends Employee{
	private String desig;
	
	public Manager(String name, double salary, int emp_id, String desig) {
		super(name, salary, emp_id);
		this.desig = desig;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Manager [desig=" + desig + "]";
	}
}

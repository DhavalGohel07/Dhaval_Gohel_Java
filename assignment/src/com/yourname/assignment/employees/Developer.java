package com.yourname.assignment.employees;

public class Developer extends Employee {
	
	
	private String lang;
	
	public Developer(String name, double salary, int emp_id, String lang) {
		super(name, salary, emp_id);
		this.lang = lang;
	}
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Developer [lang=" + lang + "]";
	}
	
}

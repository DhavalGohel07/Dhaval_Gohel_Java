package first_project;

public class Student {
	private int no;
	private String name,course,Class;
	
	public void getData() {
		no=12;
		name="Dhaval";
		course="IMCA";
		Class="IET";
	}
	public void display() {
		System.out.println("Name :"+name+"\nRoll no : "+no+"\nCourse :"+course+"\nClass :"+Class);
	}
	
}
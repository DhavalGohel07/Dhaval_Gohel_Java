package arrayofobjects;

import java.util.Scanner;

import first_project.Employee;

public class ArrayOfEmployee {

		public void CreateArrayOfEmp() {
			Employee[] emp = new Employee[10];
			
			for(int i = 0; i<2;i++) {
				emp[i] = new Employee();
			}
			
			for(int i = 0; i<2;i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Name :");
				emp[i].setName(sc.next());
				System.out.println("Enter Email :");
				emp[i].setEmail(sc.next());
			}
			for(int i = 0; i<2;i++) {
				System.out.println(emp[i]);
		}
	}
}
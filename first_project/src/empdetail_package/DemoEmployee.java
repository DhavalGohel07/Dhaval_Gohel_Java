package empdetail_package;

import emp_package.*;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Designation desig = new Designation();
		
		desig.setDesig("Senior Developer");
		desig.setDesc("Java");
		
		Employee emp = new Employee();
		
		emp.setName("Dhaval");
		emp.setDesig(desig);
		
//		System.out.println(emp);
		System.out.println("Name is : "+emp.getName());
		System.out.println(emp.getDesig());
	}

}

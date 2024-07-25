import com.yourname.assignment.employees.*;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Dhaval",38000,12,"Sales");
		Developer dev = new Developer("Aryan",28000,41,"Java");
		
		EmployeeUtilities emp_uti = new EmployeeUtilities();
		emp_uti.display(m);
		System.out.println("Department : "+m.getDesig()+"\n\n");
		
		emp_uti.display(dev);
		System.out.println("Language : "+dev.getLang());
	}

}

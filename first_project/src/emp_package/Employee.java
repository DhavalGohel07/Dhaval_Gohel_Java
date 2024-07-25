package emp_package;

public class Employee {
	private String name;
	private Designation desig;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Designation getDesig() {
		return desig;
	}
	public void setDesig(Designation desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desig=" + desig + "]";
	}
	
	
}

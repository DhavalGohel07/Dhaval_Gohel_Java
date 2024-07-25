package emp_package;


public class Designation {
	private String desig,desc;

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Designation [desig=" + desig + ", desc=" + desc + "]";
	}
	
	
}

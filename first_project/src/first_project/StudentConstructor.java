package first_project;

public class StudentConstructor {
	private String sname;
	public StudentConstructor(){
		sname = "Unknown";
	}
	
	public StudentConstructor(String sname) {
		this.sname=sname;
	}

	@Override
	public String toString() {
		return "Student Name : " + sname;
	}
	
	public static void main(String args[]) {
		StudentConstructor sc = new StudentConstructor();
		System.out.println(sc);
		StudentConstructor sc1 = new StudentConstructor("dhaval");
		System.out.print(sc1);

	}
}

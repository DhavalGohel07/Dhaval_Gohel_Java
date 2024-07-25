package selfstudy;

public class Customer {
	private String fname ,lname;
	
	public Customer(String fname,String lname) {
		this.fname =fname;
		this.lname=lname;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void CusDetails() {
		System.out.println("First name : "+fname+"  Last name : "+lname);
	}
}
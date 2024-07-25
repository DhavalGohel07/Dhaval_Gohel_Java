package selfstudy;

public class Student {
	private String fname,lname,major;
	private int year;
	
//	public String getFname() {
//		return fname;
//	}
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
//	public String getMajor() {
//		return major;
//	}
//	public void setMajor(String major) {
//		this.major = major;
//	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	@Override
//	public String toString() {
//		return "Student [fname=" + fname + ", lname=" + lname + ", major=" + major + ", year=" + year + "]";
//	}
	
	Student(String fname,String lname,String major,int year) {
		this.fname=fname;
		this.lname=lname;
		this.major=major;
		this.year=year;
	}
	
	public void Detail() {
		System.out.println("First name : "+fname+"\nLast name : "+lname+"\nMajor : "+major+"\nYear : "+year);
	}
}
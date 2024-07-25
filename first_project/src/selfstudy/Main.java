package selfstudy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem 1
//		Student std = new Student("Dhaval", "Gohel", "IMCA", 2025);
//		std.Detail();
//		Student std1 = new Student("Aryan", "Prajapati", "IMBA", 2026);
//		std1.Detail();
//		std.setFname("Dhaval");
//		std.setLname("Gohel");
//		std.setYear(2025);
//		std.setMajor("IMCA");
//		System.out.println(std);
//		std.setFname("Aryan");
//		std.setLname("Prajapati");
//		std.setYear(2026);
//		std.setMajor("IMBA");
//		System.out.println(std);
		
		//Problem 2
//		Planet p = new Planet("Earth",1200.0,98.18);
//		Planet p1 = new Planet("Mars",800.90,40.5);
//		p.Detail();
//		p1.Detail();
		
		//Problem 3
		Customer c = new Customer("Dhaval","Gohel");
		Account ac = new Account(c,160000.59);
		Account ac1 = new Account(c,250000.26);
		ac.AccDetails();
		ac1.AccDetails();
		
		//Problem 4
		
	}
}

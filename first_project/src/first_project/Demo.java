package first_project;
import java.io.*;

public class Demo extends Student{

	public static void main(String[] args) {
//		Demo s = new Demo();
//		Student1 s1= new Student1();
//		Employee emp = new Employee();
		
//		emp.setName("Tanvi");
//		emp.setEmail("tanugohel@gmail.com");
//		emp.setDesignation("Senior Developer");
//		emp.setAddress("Vejalpur");
//		emp.setSalary(50000);
//		System.out.println(emp);
		
//		CarRental car = new CarRental();
//		car.setCarid(101);
//		car.setCartype("Electronic");
//		car.setRent(54000);
//		System.out.println(car);
//		car.getData(101, "SUV", 2500);
//		car.Showcar();
//		car.getData(201, "Small", 1000);
//		car.Showcar();
//		car.getData(301, "VAN", 800);
//		car.Showcar();
//		
		
//		s1.setRollno(12);
//		s1.setName("Tanvi");
//		System.out.println(s1.getRollno());
//		System.out.println(s1.getName());
//		System.out.println(s1);
//		s.getData();
//		s.display();
		
		Address ad = new Address();
		System.out.println(ad); 
		Address ad1 = new Address("Shrinandnagar","Vejalpur","Ahmedabad",380052);
		System.out.println(ad1); 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Society Name : ");
		String sname;
		try {
			sname = br.readLine();
			ad.setSociety(sname);
			
			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
			
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
}
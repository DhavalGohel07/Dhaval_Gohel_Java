package has_relation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setFlatno("C/1");
		add.setSocityname("Shivalaya Appartment");
		add.setArea("Ahmedabad");
		add.setPincode(123);
		
		
		Person ps = new Person();
		ps.setAddr(add);
		ps.setPemail("dhavalgohel1107@gmail.com");
		ps.setPname("Dhaval");
		System.out.println(ps);
	// injection object of address class to person class 
	
	}
}
package const_overloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City c = new City();
		City c1 = new City("Mumbai","Maharastra");
		System.out.print(c);
		System.out.print(c1); 	
		
//		State c2 = new City();
//		c.display();
//		c1.display();
	}
}
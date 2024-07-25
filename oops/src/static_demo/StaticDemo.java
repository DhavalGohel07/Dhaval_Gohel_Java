package static_demo;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticEx se = new StaticEx();
//		System.out.println(StaticEx.str);
//		System.out.println(se.str);
		System.out.println(StaticEx.count +" "+se);
		
		StaticEx se1 = new StaticEx();
		System.out.println(StaticEx.count +" "+se1);
		
		StaticEx se2 = new StaticEx();
		System.out.println(StaticEx.count +" "+se2);
		
		StaticEx se3 = new StaticEx();
		System.out.println(StaticEx.count +" "+se3);
		
		se.getData();
		//We can access the static variable value using the Class name 
	}

}

package static_demo;

public class StaticEx {
	static String str = "Come on do it now";
	
	static int count = 0;
	int i =0;
	public StaticEx() {
		i++;
		++count;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
	
	static void print(){
		System.out.println("This is static block");
	}
	
	public static void getData() {
		System.out.println(count);
	}
	
	
}
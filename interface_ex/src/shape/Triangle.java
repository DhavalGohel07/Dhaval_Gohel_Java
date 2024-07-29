package shape;

public class Triangle {
	 	private int base;
	    private int height;

	    public Triangle(int base, int height) {
	        this.base = base;
	        this.height = height;
	    }

	    public void getArea() {
	    	System.out.println(0.5 * base * height);
	    }
}

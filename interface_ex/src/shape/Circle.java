package shape;

public class Circle {
	private float radius;
	private double pi = 3.14;

	public Circle(float radius) {	
		this.radius = radius;
	}
	
	public void getArea() {
		System.out.println(pi * radius * radius);
	}
}

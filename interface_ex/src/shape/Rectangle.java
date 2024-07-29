package shape;

public class Rectangle {
	private float width,height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        System.out.println(width * height); 
    }
}

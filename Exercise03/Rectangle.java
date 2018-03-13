
public class Rectangle {

	private double width;
    private double length;
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 4);
		System.out.println(r1);
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	public String toString() {
		return String.format("Shape properties:\n"
				+ "Width: %.2f\nLength: %.2f\n"
				+ "Perimeter: %.2f\nArea: %.2f\n", getWidth(), getLength(), getPerimeter(), getArea());
	}
}

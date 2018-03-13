
public class Square extends Rectangle {
	
	public static void main(String[] args) {
		Square s1 = new Square(2.5);
		System.out.println(s1);
	}
	
	public Square() {
		
	}
	
	public Square(double length) {
		this.setWidth(length);
		this.setLength(length);
	}
}

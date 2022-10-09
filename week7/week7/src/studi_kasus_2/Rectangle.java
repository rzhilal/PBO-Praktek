package studi_kasus_2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
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
	
	public Rectangle(double width, double length) {
		super("Rectangle");
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return width*length;
	}
	
	public String toString() {
		return super.toString() + " of width "+ width + " of length " + length;
	}
}

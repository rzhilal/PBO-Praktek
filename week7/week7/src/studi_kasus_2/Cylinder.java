package studi_kasus_2;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public Cylinder(double radius, double height) {
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}
	
	public double area() {
		return 4*Math.PI*radius*radius*height;
	}
	
	public String toString() {
		return super.toString() + " of radius "+ radius + " and height " + height;
	}
}

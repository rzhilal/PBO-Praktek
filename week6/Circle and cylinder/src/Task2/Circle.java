package Task2;

public class Circle extends Shape{
	private double radius;
	
	//constructor
	Circle(){
		this.radius = 1.0;
	}
	
	Circle(double radius){
		this.radius = radius;
		
	}
	
	Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	//getter and setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	@Override
	public String toString() {
		return "A Circle with radius = " + this.radius + ", which is a subclass of" + super.toString();
	}
	
}

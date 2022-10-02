 package Task2;

public class Square extends Rectangle{
	
	//Getter and setter
	Square(){
		super();
	}
	
	Square(double side){
		super(side, side);
	}
	
	Square(double side, String color, boolean filled){
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public String toString() {
		return "A Squarea with side = " + this.getSide() + " , which is a subclass of " + super.toString();
	}
	
}

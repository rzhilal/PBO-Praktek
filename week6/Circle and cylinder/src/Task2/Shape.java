package Task2;

public abstract class Shape {
	private String color;
	private boolean filled;
	
	//getter&setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	Shape(){
		this.color = "green";
		this.filled = true;
	}
	
	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String toString() {
		String fill = isFilled()?"Filled":"Not filled";
		return "A Shape with color of " + this.color + " and "+fill;
	}
	
}

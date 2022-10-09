package studi_kasus_2;

public abstract class Shape {
	private String shapeName;
	
	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	abstract double area();
	
	Shape(String shapeName){
		this.shapeName= shapeName; 
	}
	
	public String toString() {
		return "Name of the shape is "+ shapeName;
	}
}

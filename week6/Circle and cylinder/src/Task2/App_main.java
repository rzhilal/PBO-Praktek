package Task2;

public class App_main {

	public static void main(String[] args) {
		Square s1 = new Square (5, "red", true);
		System.out.println("Area : " + s1.getArea());
		System.out.println("Perimeter : " + s1.getPerimeter());
		System.out.println(s1.toString());	
	}
}

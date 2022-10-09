package studi_kasus_2;

public class PaintThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paint _paint = new Paint(10);
		Shape deck = new Rectangle(25.0, 30.0);
		System.out.println(((Rectangle)deck).toString());
		double coveraged = _paint.amount(deck);
		System.out.println(coveraged + "\n");
		
		Shape bigBall = new Sphere(15);
		System.out.println(((Sphere)bigBall).toString());
		coveraged = _paint.amount(bigBall);
		System.out.println(coveraged+ "\n");
		
		Shape _Cylinder = new Cylinder(10, 30);
		System.out.println(((Cylinder)_Cylinder).toString());
		coveraged = _paint.amount(_Cylinder);
		System.out.println(coveraged+ "\n");
	}
}


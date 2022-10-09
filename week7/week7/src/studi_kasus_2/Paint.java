package studi_kasus_2;

public class Paint {
	private double coverage;
	
	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public Paint(double c) {
		coverage = c;
	}
	
	public double amount(Shape s) {
		System.out.print("Computing amount for " + s + " is ");
		return s.area()/coverage;
	}
}
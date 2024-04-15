package SatuApril;

public class square extends shape2D {
	private double length = 1.0;
	
	public square() {
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	@Override
	public double calcArea() {
		return length * length;
	}
}

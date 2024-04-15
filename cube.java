package SatuApril;

public class cube extends shape3D{

	private double length = 1.0;
	
	public cube() {
	}
	
	public void setLength() {
		this.length = length;
	}
	
	public double getlength(double length) {
		return length;
	}
	
	@Override
	public double calcVolume() {
		return length * length * length;
	}
}

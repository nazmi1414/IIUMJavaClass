package SatuApril;

public class sphere extends shape3D{
	
	private double radius;
	
	public sphere() {
	}
	
	public void setRadius() {
		this.radius = radius;
	}
	
	public double getradius(double radius) {
		return radius;
	}
	
	@Override
	public double calcVolume() {
		return radius * radius * 3.142;
	}

}

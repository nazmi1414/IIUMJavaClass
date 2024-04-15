package SatuApril;

public class circle extends shape2D{
	
	private double radius;
	
	public circle(){		
	}
	
	public double getRadius() {	
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		double area = radius * 2 * 3.142 ;
		return area;
	}
}
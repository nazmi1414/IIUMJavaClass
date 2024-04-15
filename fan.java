package SatuApril;

public class fan {

	int speed;
	boolean on;
	double radius;
	String color;
	
	fan(){
		final int SLOW = 1;
		final int MEDIUM = 2;
		final int FAST = 3;
		speed = SLOW ;
		on = false;
		radius = 5;
		color = "blue";
	}
	
	public int getspeed() {
		return speed;
	}
	public boolean geton() {
		return on;
	}
	public double getradius() {
		return radius;
	}
	public String getcolor() {
		return color;
	}
	
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public void seton(boolean on) {
		this.on = on;
	}
	public void setradius(double radius) {
		this.radius = radius;
	}
	public void setcolor(String color) {
		this.color = color;
	}
}

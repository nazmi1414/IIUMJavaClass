package SatuApril;

public abstract class shape {

	private int dimension;
	
	public shape() {	
	}
	public int getDimension() {
		return dimension;
	}
	
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public abstract double calcArea();
	public abstract double calcVolume();
}
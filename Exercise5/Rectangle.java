package Exercise5;

public class Rectangle {
	double height;
	double width;
	public Rectangle() {
	}
	public Rectangle(double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
	}
	public double getArea() {
		return height * width;
	}
	public double getPerimeter() {
		return height + height + width + width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
}

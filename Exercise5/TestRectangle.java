package Exercise5;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(4.0, 40.0);
		
		System.out.println("The area of the rectangle of the height "+ myRectangle.getHeight() + 
				" and " + myRectangle.getWidth() + " is " + myRectangle.getArea());
		
		myRectangle.setHeight(3.5);
		myRectangle.setWidth(39.5);
		
		System.out.println("The area of the rectangle of the height "+ myRectangle.getHeight() + 
				" and " + myRectangle.getWidth() + " is " + myRectangle.getArea());
		
	}

}

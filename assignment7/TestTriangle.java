package assignment7;
import java.util.Scanner;

public class TestTriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the triangle sides: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle segitiga = new Triangle(side1, side2, side3);
		
		
		System.out.print("\nEnter the colour of the Triangle: ");
		String colour = input.next();
		
		char[] tempColour = colour.toCharArray();
		tempColour[0] = Character.toUpperCase(tempColour[0]);
		colour = new String(tempColour);
		segitiga.setColour(colour);
		
		System.out.print("\nIs the triangle filled? (true/false): ");
		segitiga.setFilled(input.nextBoolean());
			
		System.out.println("\nThe area of the triangle is " + segitiga.getArea() +
				"\nThe perimeter of the triangle is " + segitiga.getPerimeter() +
				"\nThe color of the triangle is " + segitiga.getColour() +
				"\nThe triangle is filled " + segitiga.isFilled());
	}
}
